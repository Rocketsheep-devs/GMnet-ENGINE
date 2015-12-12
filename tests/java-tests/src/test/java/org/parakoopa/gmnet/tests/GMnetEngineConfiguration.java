/*
 * Copyright (c) 2015 Marco Köpcke <parakoopa at live.de>.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.parakoopa.gmnet.tests;

/**
 * Represents a game maker variable, added to the htme_config script.
 * @see org.parakoopa.gmnet.tests.AbstractTest.insertConfiguration
 * @author Marco Köpcke <parakoopa at live.de>
 */
public class GMnetEngineConfiguration {
    public final String VARIABLE;
    public final String VALUE;

    /**
     * Constructs a new game maker configuration variable.
     * @see org.parakoopa.gmnet.tests.AbstractTest.insertConfiguration
     * @param VARIABLE
     * @param VALUE 
     */
    public GMnetEngineConfiguration(String VARIABLE, String VALUE) {
        this.VARIABLE = VARIABLE;
        this.VALUE = VALUE;
    }
}