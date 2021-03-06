/*
 * Copyright 2001-2004 The Apache Software Foundation.
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
package org.apache.commons.logging.avalon;

import org.apache.avalon.framework.logger.ConsoleLogger;
import org.apache.commons.logging.impl.AvalonLogger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.AbstractLogTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * @author <a href="mailto:neeme@apache.org">Neeme Praks</a>
 * @version $Revision: 209408 $ $Date: 2005-07-06 06:15:39 +0100 (Wed, 06 Jul 2005) $
 */
public class AvalonLoggerTestCase extends AbstractLogTest {

    public static void main(String[] args) {
        String[] testCaseName = { AvalonLoggerTestCase.class.getName() };
        junit.textui.TestRunner.main(testCaseName);	
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTestSuite(AvalonLoggerTestCase.class);
        return suite;
    }

    public Log getLogObject() {
        Log log = new AvalonLogger(new ConsoleLogger());
		return log;
	}
}
