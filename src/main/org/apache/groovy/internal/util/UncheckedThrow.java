/*
 * Copyright 2003-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.groovy.internal.util;

import org.apache.groovy.lang.annotation.Incubating;

/**
 * Allows to throw a checked exception unchecked.
 */
@Incubating
public class UncheckedThrow {
    public static void rethrow( final Throwable checkedException ) {
        UncheckedThrow.<RuntimeException>thrownInsteadOf( checkedException );
    }
    @SuppressWarnings("unchecked")
    private static <T extends Throwable> void thrownInsteadOf(Throwable t) throws T {
        throw (T) t;
    }
}

