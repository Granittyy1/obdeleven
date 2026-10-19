package O6;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* JADX INFO: compiled from: ProtobufValueEncoderContext.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements L6.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4867a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4868b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public L6.b f4869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.google.firebase.encoders.proto.b f4870d;

    public f(com.google.firebase.encoders.proto.b bVar) {
        this.f4870d = bVar;
    }

    @Override // L6.f
    public final L6.f f(String str) throws IOException {
        if (this.f4867a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f4867a = true;
        this.f4870d.h(this.f4869c, str, this.f4868b);
        return this;
    }

    @Override // L6.f
    public final L6.f g(boolean z10) throws IOException {
        if (this.f4867a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f4867a = true;
        this.f4870d.g(this.f4869c, z10 ? 1 : 0, this.f4868b);
        return this;
    }
}
