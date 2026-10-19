package p033c7;

import Q3.d;
import com.google.protobuf.AbstractC2059a;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.S;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.Callable;
import p313z6.n;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Q implements Callable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22403d;

    public /* synthetic */ Q(Object obj, int i10, Object obj2) {
        this.f22401b = i10;
        this.f22402c = obj;
        this.f22403d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.f22401b) {
            case 0:
                T t8 = (T) this.f22402c;
                S s10 = (S) this.f22403d;
                synchronized (t8) {
                    try {
                        try {
                            FileInputStream fileInputStreamOpenFileInput = t8.f22406a.openFileInput(t8.f22407b);
                            try {
                                AbstractC2059a abstractC2059a = (AbstractC2059a) s10.b(fileInputStreamOpenFileInput);
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                                return abstractC2059a;
                            } catch (Throwable th) {
                                if (fileInputStreamOpenFileInput != null) {
                                    try {
                                        fileInputStreamOpenFileInput.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    break;
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (InvalidProtocolBufferException | FileNotFoundException e10) {
                        e10.getMessage();
                        d.C();
                        return null;
                    }
                }
            default:
                n nVar = (n) this.f22402c;
                nVar.f48892a.h(nVar.f48894c, (List) this.f22403d);
                return null;
        }
    }
}
