package Zb;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: AbstractFullBox.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f7975h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7977f;

    static {
        Ab.a aVar = new Ab.a(c.class, "AbstractFullBox.java");
        f7974g = aVar.e(aVar.d("setVersion", "org.mp4parser.support.AbstractFullBox", "int", "version", "void"));
        f7975h = aVar.e(aVar.d("setFlags", "org.mp4parser.support.AbstractFullBox", "int", "flags", "void"));
    }

    @Override // Zb.a
    public void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
    }

    public final void c(int i10) {
        Ab.b bVarC = Ab.a.c(f7975h, this, this, Integer.valueOf(i10));
        e.a();
        e.b(bVarC);
        this.f7977f = i10;
    }

    public final void d() {
        Ab.b bVarC = Ab.a.c(f7974g, this, this, 1);
        e.a();
        e.b(bVarC);
        this.f7976e = 1;
    }

    public final void e(ByteBuffer byteBuffer) {
        C6.b.k(this.f7976e, byteBuffer);
        C6.b.j(this.f7977f, byteBuffer);
    }
}
