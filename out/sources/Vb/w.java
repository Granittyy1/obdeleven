package Vb;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: TimeToSampleBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends Zb.c {
    public static final /* synthetic */ Ab.b.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6946k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<a> f6947i;

    /* JADX INFO: compiled from: TimeToSampleBox.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f6948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6949b;

        public a(long j, long j10) {
            this.f6948a = j;
            this.f6949b = j10;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Entry{count=");
            sb2.append(this.f6948a);
            sb2.append(", delta=");
            return C4.a.h(sb2, this.f6949b, '}');
        }
    }

    static {
        Ab.a aVar = new Ab.a(w.class, "TimeToSampleBox.java");
        aVar.e(aVar.d("getEntries", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "", "", "java.util.List"));
        j = aVar.e(aVar.d("setEntries", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "java.util.List", "entries", "void"));
        f6946k = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.TimeToSampleBox", "", "", "java.lang.String"));
        new WeakHashMap();
    }

    public w() {
        super("stts");
        this.f6947i = Collections.emptyList();
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        byteBuffer.putInt(this.f6947i.size());
        for (a aVar : this.f6947i) {
            byteBuffer.putInt((int) aVar.f6948a);
            byteBuffer.putInt((int) aVar.f6949b);
        }
    }

    @Override // Zb.a
    public final long b() {
        return (this.f6947i.size() * 8) + 8;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6946k, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        return "TimeToSampleBox[entryCount=" + this.f6947i.size() + "]";
    }
}
