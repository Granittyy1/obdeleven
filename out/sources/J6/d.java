package J6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: IDynamicLinksService.java */
/* JADX INFO: loaded from: classes3.dex */
public interface d extends IInterface {

    /* JADX INFO: compiled from: IDynamicLinksService.java */
    public static abstract class a extends Binder implements d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f4042c = 0;

        /* JADX INFO: renamed from: J6.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: IDynamicLinksService.java */
        public static class C0052a implements d {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public IBinder f4043c;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f4043c;
            }
        }
    }
}
