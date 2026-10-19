package io.ktor.http;

import io.ktor.util.StringValuesBuilderImpl;
import java.util.List;

/* JADX INFO: compiled from: Headers.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h extends StringValuesBuilderImpl {
    public h() {
        this(0);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public final void i(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        List<String> list = k.f40481a;
        int i10 = 0;
        int i11 = 0;
        while (i10 < name.length()) {
            char cCharAt = name.charAt(i10);
            int i12 = i11 + 1;
            if (kotlin.jvm.internal.i.g(cCharAt, 32) <= 0 || kotlin.text.n.K("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                throw new IllegalHeaderNameException(name, i11);
            }
            i10++;
            i11 = i12;
        }
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public final void j(String value) {
        kotlin.jvm.internal.i.e(value, "value");
        List<String> list = k.f40481a;
        int i10 = 0;
        int i11 = 0;
        while (i10 < value.length()) {
            char cCharAt = value.charAt(i10);
            int i12 = i11 + 1;
            if (kotlin.jvm.internal.i.g(cCharAt, 32) < 0 && cCharAt != '\t') {
                throw new IllegalHeaderValueException(value, i11);
            }
            i10++;
            i11 = i12;
        }
    }

    public h(int i10) {
        super(8);
    }
}
