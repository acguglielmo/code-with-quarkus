package com.acguglielmo.codewithquarkus;

import org.junit.jupiter.api.Tag;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
@Tag("NativeImageTest")
public class NativeExampleResourceIT extends ExampleResourceTest {

    // Execute the same tests but in native mode.
}