package com.github.tinosteinort.flda.interfaces.fixedlengthstring.writer;

public class FloatAttributeWriter extends NumberAttributeWriter<Float> {

    public FloatAttributeWriter() {
    }

    public FloatAttributeWriter(final char filler) {
        super(filler);
    }

    @Override protected String nullSafeConvertToString(final Float value) {
        return String.valueOf(value);
    }
}
