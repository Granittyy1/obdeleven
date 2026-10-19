package androidx.media3.common.audio;

import A1.C0575j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import p114j1.A;

/* JADX INFO: loaded from: classes.dex */
public interface AudioProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f17865a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        public final a inputAudioFormat;

        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
            this.inputAudioFormat = aVar;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f17866e = new a(-1, -1, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f17867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17868b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f17869c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f17870d;

        public a(int i10, int i11, int i12) {
            this.f17867a = i10;
            this.f17868b = i11;
            this.f17869c = i12;
            this.f17870d = A.C(i12) ? A.p(i12) * i11 : -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17867a == aVar.f17867a && this.f17868b == aVar.f17868b && this.f17869c == aVar.f17869c;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f17867a), Integer.valueOf(this.f17868b), Integer.valueOf(this.f17869c));
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
            sb2.append(this.f17867a);
            sb2.append(", channelCount=");
            sb2.append(this.f17868b);
            sb2.append(", encoding=");
            return C0575j.b(sb2, this.f17869c, ']');
        }
    }

    boolean c();

    boolean d();

    ByteBuffer e();

    void f(ByteBuffer byteBuffer);

    void flush();

    void g();

    a h(a aVar) throws UnhandledAudioFormatException;

    void reset();
}
