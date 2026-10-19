package com.obdeleven.service.core.gen1;

import C4.v;
import com.obdeleven.service.exception.CommandException;

/* JADX INFO: compiled from: KlineSlowInitCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends com.obdeleven.service.core.d<a> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29259h;

    /* JADX INFO: compiled from: KlineSlowInitCommand.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f29261b;

        public a(String response, boolean z10) {
            kotlin.jvm.internal.i.e(response, "response");
            this.f29260a = response;
            this.f29261b = z10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.i.a(this.f29260a, aVar.f29260a) && this.f29261b == aVar.f29261b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f29261b) + (this.f29260a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Result(response=");
            sb2.append(this.f29260a);
            sb2.append(", isKwp2000=");
            return v.f(sb2, this.f29261b, ")");
        }
    }

    public d(String str) {
        super("22".concat(str), true);
        this.f29259h = "";
    }

    @Override // com.obdeleven.service.core.d
    public final void e(byte[] bArr) {
        int i10 = bArr[0] & 255;
        if (i10 == 34) {
            int i11 = bArr[1] & 255;
            if (i11 != 0) {
                g(new CommandException(i11));
                return;
            }
            String strA = com.obdeleven.service.util.b.a(Q3.d.t(bArr, 2, bArr.length));
            String strSubstring = strA.substring(4, 8);
            kotlin.jvm.internal.i.d(strSubstring, "substring(...)");
            if (kotlin.text.m.I(strSubstring, "010A", false) || kotlin.text.m.I(strSubstring, "0105", false) || kotlin.text.m.I(strSubstring, "0900", false)) {
                return;
            }
            h(new a(strA, true));
            return;
        }
        if (i10 == 33) {
            int i12 = bArr[1] & 255;
            if (i12 != 0) {
                g(new CommandException(i12));
                return;
            }
            if (bArr.length > 3) {
                byte[] bArrT = (((bArr[3] << 8) | (bArr[2] & 255)) & 65535) == 0 ? new byte[0] : Q3.d.t(bArr, 4, bArr.length);
                if (bArrT.length == 0) {
                    h(new a(this.f29259h, false));
                } else if (bArrT.length > 2) {
                    this.f29259h = com.obdeleven.service.util.b.a(Q3.d.t(bArrT, 2, bArrT.length - 1));
                }
            }
        }
    }
}
