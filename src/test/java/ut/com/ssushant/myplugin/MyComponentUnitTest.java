package ut.com.ssushant.myplugin;

import com.ssushant.myplugin.api.MyPluginComponent;
import com.ssushant.myplugin.impl.MyPluginComponentImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {
    @Test
    public void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent", component.getName());
    }
}