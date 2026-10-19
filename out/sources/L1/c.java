package L1;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* JADX INFO: compiled from: EventMessageEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f4432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataOutputStream f4433b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f4432a = byteArrayOutputStream;
        this.f4433b = new DataOutputStream(byteArrayOutputStream);
    }
}
