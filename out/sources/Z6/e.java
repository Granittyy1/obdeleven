package Z6;

import com.google.firebase.inappmessaging.model.MessageType;

/* JADX INFO: compiled from: InflaterConfigModule.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: compiled from: InflaterConfigModule.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7929a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f7929a = iArr;
            try {
                iArr[MessageType.MODAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7929a[MessageType.CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7929a[MessageType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7929a[MessageType.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }
}
