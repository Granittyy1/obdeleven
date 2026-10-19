package Vb;

import io.intercom.android.sdk.models.AttributeType;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: SoundMediaHeaderBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6940i;
    public static final /* synthetic */ Ab.b.a j;

    static {
        Ab.a aVar = new Ab.a(s.class, "SoundMediaHeaderBox.java");
        f6940i = aVar.e(aVar.d("getBalance", "org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox", "", "", AttributeType.FLOAT));
        j = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.SoundMediaHeaderBox", "", "", "java.lang.String"));
    }

    public s() {
        super("smhd");
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        C6.b.h(byteBuffer, 0.0f);
        C6.b.i(0, byteBuffer);
    }

    @Override // Zb.a
    public final long b() {
        return 8L;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(j, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        StringBuilder sb2 = new StringBuilder("SoundMediaHeaderBox[balance=");
        Ab.b bVarB2 = Ab.a.b(f6940i, this, this);
        Zb.e.a();
        Zb.e.b(bVarB2);
        sb2.append(0.0f);
        sb2.append("]");
        return sb2.toString();
    }
}
