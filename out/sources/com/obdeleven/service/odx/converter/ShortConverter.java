package com.obdeleven.service.odx.converter;

import kotlin.NotImplementedError;
import kotlin.text.n;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: compiled from: ShortConverter.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ShortConverter implements Converter<Short> {
    @Override // org.simpleframework.xml.convert.Converter
    public /* bridge */ /* synthetic */ void write(OutputNode outputNode, Short sh) {
        write(outputNode, sh.shortValue());
    }

    @Override // org.simpleframework.xml.convert.Converter
    public Short read(InputNode inputNode) {
        String value;
        String string;
        return Short.valueOf((inputNode == null || (value = inputNode.getValue()) == null || (string = n.p0(value).toString()) == null) ? (short) 0 : Short.parseShort(string));
    }

    public void write(OutputNode outputNode, short s10) {
        throw new NotImplementedError("An operation is not implemented.");
    }
}
