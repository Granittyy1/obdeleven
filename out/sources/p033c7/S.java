package p033c7;

import com.google.protobuf.GeneratedMessageLite;
import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class S implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f22404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GeneratedMessageLite f22405c;

    public /* synthetic */ S(T t8, GeneratedMessageLite generatedMessageLite) {
        this.f22404b = t8;
        this.f22405c = generatedMessageLite;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        T t8 = this.f22404b;
        GeneratedMessageLite generatedMessageLite = this.f22405c;
        synchronized (t8) {
            FileOutputStream fileOutputStreamOpenFileOutput = t8.f22406a.openFileOutput(t8.f22407b, 0);
            try {
                fileOutputStreamOpenFileOutput.write(generatedMessageLite.n());
                fileOutputStreamOpenFileOutput.close();
            } catch (Throwable th) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return generatedMessageLite;
    }
}
