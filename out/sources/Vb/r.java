package Vb;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: SampleToChunkBox.java */
/* JADX INFO: loaded from: classes2.dex */
public final class r extends Zb.c {
    public static final /* synthetic */ Ab.b.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6934k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ Ab.b.a f6935l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<a> f6936i;

    /* JADX INFO: compiled from: SampleToChunkBox.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f6937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f6938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f6939c;

        public a(long j, long j10, long j11) {
            this.f6937a = j;
            this.f6938b = j10;
            this.f6939c = j11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f6937a == aVar.f6937a && this.f6939c == aVar.f6939c && this.f6938b == aVar.f6938b;
        }

        public final int hashCode() {
            long j = this.f6937a;
            long j10 = this.f6938b;
            int i10 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f6939c;
            return i10 + ((int) ((j11 >>> 32) ^ j11));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Entry{firstChunk=");
            sb2.append(this.f6937a);
            sb2.append(", samplesPerChunk=");
            sb2.append(this.f6938b);
            sb2.append(", sampleDescriptionIndex=");
            return C4.a.h(sb2, this.f6939c, '}');
        }
    }

    static {
        Ab.a aVar = new Ab.a(r.class, "SampleToChunkBox.java");
        j = aVar.e(aVar.d("getEntries", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "", "", "java.util.List"));
        f6934k = aVar.e(aVar.d("setEntries", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "java.util.List", "entries", "void"));
        f6935l = aVar.e(aVar.d("toString", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("blowup", "org.mp4parser.boxes.iso14496.part12.SampleToChunkBox", "int", "chunkCount", "[J"));
    }

    public r() {
        super("stsc");
        this.f6936i = Collections.emptyList();
    }

    @Override // Zb.c, Zb.a
    public final void a(ByteBuffer byteBuffer) {
        e(byteBuffer);
        byteBuffer.putInt(this.f6936i.size());
        for (a aVar : this.f6936i) {
            byteBuffer.putInt((int) aVar.f6937a);
            byteBuffer.putInt((int) aVar.f6938b);
            byteBuffer.putInt((int) aVar.f6939c);
        }
    }

    @Override // Zb.a
    public final long b() {
        return (this.f6936i.size() * 12) + 8;
    }

    public final String toString() {
        Ab.b bVarB = Ab.a.b(f6935l, this, this);
        Zb.e.a();
        Zb.e.b(bVarB);
        return "SampleToChunkBox[entryCount=" + this.f6936i.size() + "]";
    }
}
