/*
 * Copyright 2017 Mirko Sertic
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
package de.mirkosertic.bytecoder.classlib.java.lang;

import de.mirkosertic.bytecoder.unittest.BytecoderUnitTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(BytecoderUnitTestRunner.class)
public class TLongTest {

    @Test
    public void testEquals() throws Exception {
        Long theShort = new Long((int) 10);
        assertEquals(theShort,theShort);
        assertNotEquals(theShort, new Long((int) 11));
        assertNotEquals(theShort, null);
        assertNotEquals(theShort, "");
    }

    @Test
    public void testHashCode() throws Exception {
        assertEquals(new Long((int) 10), new Long((int) 10));
    }

    @Test
    public void testIntValue() throws Exception {
        assertEquals(10, new Long((int) 10).intValue(), 0);
    }

    @Test
    public void restBbyteValue() throws Exception {
        assertEquals(10, new Long((int) 10).byteValue(), 0);
    }

    @Test
    public void testShortValue() throws Exception {
        assertEquals(10, new Long((int) 10).shortValue(), 0);
    }

    @Test
    public void testFloatValue() throws Exception {
        assertEquals(10, new Long((int) 10).floatValue(), 0);
    }

    @Test
    public void testLongValue() throws Exception {
        assertEquals(10, new Long((int) 10).longValue(), 0);
    }

    @Test
    public void testDoubleValue() throws Exception {
        assertEquals(10, new Long((int) 10).doubleValue(), 0);
    }

    @Test
    public void testToString() {
        assertEquals("123", new Long(123).toString());
    }

    @Test
    public void testValueOfInt() {
        assertEquals(123, Long.valueOf(123).intValue(), 0);
    }

    @Test
    public void testValueOfString() {
        assertEquals(123, Long.valueOf("123").intValue(), 0);
    }

    @Test
    public void testValueOfNegativeString() {
        assertEquals(-123, Long.valueOf("-123").intValue(), 0);
    }

    @Test
    public void testParseLong() {
        assertEquals(-123, Long.parseLong("-123"), 0);
    }

    @Test
    public void testToHexString() {
        assertEquals("3039", Long.toHexString(12345));
    }
}