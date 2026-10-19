package com.obdeleven.service.protocol;

import androidx.compose.ui.text.font.s;
import com.obdeleven.service.core.gen1.i;
import com.parse.boltsinternal.Task;
import com.voltasit.obdeleven.domain.models.Nrc;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Kwp2000Protocol extends Protocol {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Type f29520g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Type f29521b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Type f29522c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Type[] f29523d;

        static {
            Type type = new Type("PHYSICAL", 0);
            f29521b = type;
            Type type2 = new Type("FUNCTIONAL", 1);
            f29522c = type2;
            f29523d = new Type[]{type, type2};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f29523d.clone();
        }
    }

    public class a extends i {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f29524h;

        public a(String str) {
            super(str);
        }

        @Override // com.obdeleven.service.core.gen1.i
        public final void i(byte[] bArr) {
            if (bArr.length == 0) {
                h(this.f29524h);
                return;
            }
            int i10 = bArr[0];
            int i11 = ((i10 & 255) >> 6) & 3;
            int i12 = i10 & 63;
            int i13 = i11 == 0 ? 1 : 3;
            if (i12 == 0) {
                int i14 = i13 + 1;
                if (bArr.length >= i14) {
                    i12 = bArr[i13];
                }
                i13 = i14;
            }
            if (i12 == 0 || bArr.length != i12 + i13 + 1) {
                return;
            }
            if ((bArr[i13] & 255) == 127) {
                int i15 = bArr[i13 + 2] & 255;
                Nrc.f30496b.getClass();
                Nrc nrcA = Nrc.a.a(i15);
                O.e.D(Kwp2000Protocol.this.f29527b, String.format("NRC(%02X: %s)", Integer.valueOf(nrcA.a()), nrcA.b()));
                if (i15 != 120) {
                    this.f29524h = com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, i13, bArr.length - 1));
                    return;
                }
                return;
            }
            if (this.f29524h == null) {
                this.f29524h = com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, i13, bArr.length - 1));
                return;
            }
            this.f29524h += com.obdeleven.service.util.b.a(Arrays.copyOfRange(bArr, i13 + 1, bArr.length - 1));
        }
    }

    public Kwp2000Protocol(int i10, Type type) {
        super("KWP2000");
        O.e.j("KWP2000", "");
        this.f29519f = i10;
        this.f29520g = type;
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final long b(Protocol.State state) {
        return state == Protocol.State.f29532c ? 1000L : 0L;
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<String> c(String str) {
        int length = str.length() / 2;
        int i10 = this.f29520g == Type.f29521b ? 128 : 192;
        if (length <= 63) {
            i10 |= length;
        }
        String strConcat = String.format("%02X%02XF1", Integer.valueOf(i10), Integer.valueOf(this.f29519f));
        if (length > 63) {
            strConcat = strConcat.concat(String.format("%02X", Integer.valueOf(length)));
        }
        String strB = s.b(strConcat, str);
        int i11 = 0;
        int i12 = 0;
        while (i11 < strB.length()) {
            int i13 = i11 + 2;
            i12 += Integer.parseInt(strB.substring(i11, i13), 16) & 255;
            i11 = i13;
        }
        return new a(strB.concat(String.format("%02X", Integer.valueOf(i12 & 255)))).a();
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final Task<Void> e() {
        return c("82").makeVoid();
    }

    @Override // com.obdeleven.service.protocol.Protocol
    public final void f(Protocol.State state) {
        O.e.j(this.f29527b, "onTimeout(" + state.name() + ")");
        g("3E");
    }
}
