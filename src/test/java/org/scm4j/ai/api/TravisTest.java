package org.scm4j.ai.api;

import org.junit.Test;

import static org.junit.Assert.*;

public class TravisTest {

    @Test
    public void testAction() {
        IAction act = new Action("ExeRunner");
        assertEquals(act.getInstallerClass(), "ExeRunner");
    }
}
