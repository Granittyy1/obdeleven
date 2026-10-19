package R0;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: TypefaceEmojiRasterizer.java */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<S0.a> f5183d = new ThreadLocal<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f5185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f5186c = 0;

    public n(l lVar, int i10) {
        this.f5185b = lVar;
        this.f5184a = i10;
    }

    public final int a(int i10) {
        S0.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = aVarC.f5345b;
        int i11 = iA + aVarC.f5344a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final int b() {
        S0.a aVarC = c();
        int iA = aVarC.a(16);
        if (iA == 0) {
            return 0;
        }
        int i10 = iA + aVarC.f5344a;
        return aVarC.f5345b.getInt(aVarC.f5345b.getInt(i10) + i10);
    }

    public final S0.a c() {
        ThreadLocal<S0.a> threadLocal = f5183d;
        S0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new S0.a();
            threadLocal.set(aVar);
        }
        S0.b bVar = this.f5185b.f5173a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f5344a;
            int i11 = (this.f5184a * 4) + bVar.f5345b.getInt(i10) + i10 + 4;
            int i12 = bVar.f5345b.getInt(i11) + i11;
            ByteBuffer byteBuffer = bVar.f5345b;
            aVar.f5345b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f5344a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f5346c = i13;
                aVar.f5347d = aVar.f5345b.getShort(i13);
            } else {
                aVar.f5344a = 0;
                aVar.f5346c = 0;
                aVar.f5347d = 0;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        S0.a aVarC = c();
        int iA = aVarC.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? aVarC.f5345b.getInt(iA + aVarC.f5344a) : 0));
        sb2.append(", codepoints:");
        int iB = b();
        for (int i10 = 0; i10 < iB; i10++) {
            sb2.append(Integer.toHexString(a(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
