package androidx.compose.foundation.lazy.layout;

import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10569b;

    public /* synthetic */ A(int i10) {
        this.f10569b = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10569b) {
            case 0:
                return kotlin.jvm.internal.i.g(((z) obj).getIndex(), ((z) obj2).getIndex());
            case 1:
                return Long.compare(((g2.d) obj).f35520b, ((g2.d) obj2).f35520b);
            case 2:
                return ((w1.h.a) obj).f47733a - ((w1.h.a) obj2).f47733a;
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    byte b11 = bArr2[i10];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
        }
    }
}
