package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.List;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class JsonArrayTest {

    @Test(timeout = 4000)
    public void test3() throws IOException {
        JsonParser jsonParser = new JsonParser(new Json.DefaultHandler());
        Reader reader = new StringReader("10");
        assertEquals(new JsonNumber("10"), Json.parse(reader));
        reader = new StringReader("\"10\"");
        assertEquals(new JsonString("10"), Json.parse(reader));
        reader = new StringReader("true");
        assertEquals(new JsonLiteral("true"), Json.parse(reader));
        reader = new StringReader("true");
        assertEquals(new JsonLiteral("true"), Json.parse(reader));
        reader = new StringReader("1.333");
        assertEquals(new JsonNumber("1.333"), Json.parse(reader));
        reader = new StringReader(String.valueOf(Long.MAX_VALUE));
        assertEquals(new JsonNumber(String.valueOf(Long.MAX_VALUE)), Json.parse(reader));
        reader = new StringReader("[1 ,2 ,3]");
        JsonArray array = new JsonArray();
        array.add(1);
        array.add(2);
        array.add(3);
        assertEquals(array, Json.parse(reader));
        Json.value((String) null);
        assertEquals(new JsonString("dddddd"), Json.parse("\"dddddd\""));
        assertEquals(new JsonArray(), Json.array());
        assertEquals(array, Json.array(1, 2, 3));
        array = new JsonArray();
        array.add(true);
        array.add(false);
        assertEquals(array, Json.array(true, false));
        array = new JsonArray();
        array.add("d");
        array.add("d");
        assertEquals(array, Json.array("d", "d"));
        array = new JsonArray();
        array.add((long) 1);
        array.add((long) 1);
        assertEquals(array, Json.array((long) 1, (long) 1));
        array = new JsonArray();
        array.add((float) 1);
        array.add((float) 1);
        assertEquals(array, Json.array((float) 1, (float) 1));
        array = new JsonArray();
        array.add((double) 1);
        array.add((double) 1);
        assertEquals(array, Json.array((double) 1, (double) 1));
        assertEquals(new JsonObject(), Json.object());
    }

    @Test(timeout = 4000)
    public void test12() throws IOException {
        JsonValue json = JsonValue.readFrom("223");
        JsonValue json2 = JsonValue.readFrom(new StringReader("223"));
        assertEquals(JsonValue.readFrom("223"), JsonValue.valueOf(223));
        assertEquals(JsonValue.readFrom("\"223\""), JsonValue.valueOf("223"));
        assertEquals(JsonValue.readFrom("223"), JsonValue.valueOf((long) 223));
    }
}

