package com.obdeleven.service.odx.converter;

import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;

/* JADX INFO: loaded from: classes3.dex */
public class CollapsedStringConverter implements Converter<String> {
    public static boolean isWhiteSpace(char c10) {
        if (c10 > ' ') {
            return false;
        }
        return c10 == '\t' || c10 == '\n' || c10 == '\r' || c10 == ' ';
    }

    @Override // org.simpleframework.xml.convert.Converter
    public String read(InputNode inputNode) throws Exception {
        String value = inputNode.getValue();
        if (value == null) {
            return null;
        }
        int length = value.length();
        int i10 = 0;
        while (i10 < length && !isWhiteSpace(value.charAt(i10))) {
            i10++;
        }
        if (i10 == length) {
            return value;
        }
        StringBuilder sb2 = new StringBuilder(length);
        if (i10 != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append(value.charAt(i11));
            }
            sb2.append(' ');
        }
        boolean z10 = true;
        for (int i12 = i10 + 1; i12 < length; i12++) {
            char cCharAt = value.charAt(i12);
            boolean zIsWhiteSpace = isWhiteSpace(cCharAt);
            if (!z10 || !zIsWhiteSpace) {
                if (zIsWhiteSpace) {
                    sb2.append(' ');
                } else {
                    sb2.append(cCharAt);
                }
                z10 = zIsWhiteSpace;
            }
        }
        int length2 = sb2.length();
        if (length2 > 0) {
            int i13 = length2 - 1;
            if (sb2.charAt(i13) == ' ') {
                sb2.setLength(i13);
            }
        }
        return sb2.toString();
    }

    @Override // org.simpleframework.xml.convert.Converter
    public void write(OutputNode outputNode, String str) throws Exception {
        outputNode.setValue(str);
    }
}
