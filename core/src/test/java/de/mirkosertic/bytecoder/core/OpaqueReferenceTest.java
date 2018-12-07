/*
 * Copyright 2018 Mirko Sertic
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.mirkosertic.bytecoder.core;

import de.mirkosertic.bytecoder.api.Callback;
import de.mirkosertic.bytecoder.api.web.Document;
import de.mirkosertic.bytecoder.api.web.Event;
import de.mirkosertic.bytecoder.api.web.Window;
import de.mirkosertic.bytecoder.classlib.java.lang.TSystem;
import de.mirkosertic.bytecoder.unittest.BytecoderUnitTestRunner;
import de.mirkosertic.bytecoder.unittest.JSAndWASMOnly;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(BytecoderUnitTestRunner.class)
@JSAndWASMOnly
public class OpaqueReferenceTest {

    @Test
    public void testGetSetTitle() {
        final Document currentDocument = Window.window().document();
        //final String currentTitle = currentDocument.getTitle();

        final String theABC = "Bytecoder";
        TSystem.logDebug(theABC);
        TSystem.logDebug(theABC.getBytes());
        currentDocument.setTitle(theABC);
        Assert.assertEquals("Bytecoder", currentDocument.getTitle());
    }

    @Test
    public void testEventListenerLambda() {
        final Window window = Window.window();
        window.document().addEventListener("click", aValue -> System.out.println("clicked!"));
    }

    @Test
    public void testEventListenerAnonymousInnerClass() {
        final Window window = Window.window();
        //noinspection Convert2Lambda
        window.document().addEventListener("click", new Callback<Event>() {
            @Override
            public void run(final Event aValue) {
                System.out.println("clicked!");
            }
        });
    }

}
