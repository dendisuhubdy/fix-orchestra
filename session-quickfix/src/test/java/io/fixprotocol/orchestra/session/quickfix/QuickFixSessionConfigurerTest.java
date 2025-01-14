/**
 * Copyright 2015-2016 FIX Protocol Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */
package io.fixprotocol.orchestra.session.quickfix;

import static org.junit.Assert.assertNotNull;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URI;
import java.time.ZonedDateTime;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.fixprotocol.orchestra.session.quickfix.QuickFixSessionConfigurer;

/**
 * @author Don Mendelson
 *
 */
public class QuickFixSessionConfigurerTest {

  private QuickFixSessionConfigurer tool;

  @Before
  public void setUp() throws Exception {
    tool = new QuickFixSessionConfigurer();
  }

  @After
  public void tearDown() throws Exception {}


  @Test
  public void testCreateFixSession() throws Exception {

    tool.configure(Thread.currentThread().getContextClassLoader().getResourceAsStream("SampleInterfaces.xml"), 
        new FileOutputStream("QuickFixConfiguration.ini"));
  }

}
