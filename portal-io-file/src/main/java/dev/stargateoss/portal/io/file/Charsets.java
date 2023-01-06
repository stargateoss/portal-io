/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.stargateoss.portal.io.file;

import java.nio.charset.Charset;

/**
 * Charsets required of every implementation of the Java platform.
 * 
 * @see <a href="http://docs.oracle.com/javase/6/docs/api/java/nio/charset/Charset.html">Standard charsets</a>
 * @since 2.3
 * @version $Id$
 */
public class Charsets {

    /**
     * Returns the given Charset or the default Charset if the given Charset is null.
     * 
     * @param charset
     *            A charset or null.
     * @return the given Charset or the default Charset if the given Charset is null
     */
    public static Charset toCharset(final Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }

}
