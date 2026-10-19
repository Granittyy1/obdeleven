package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public enum e6 implements IPutIntoJson {
    SUBSCRIBED,
    UNSUBSCRIBED;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20921a;

        static {
            int[] iArr = new int[e6.values().length];
            try {
                iArr[e6.SUBSCRIBED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e6.UNSUBSCRIBED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20921a = iArr;
        }
    }

    @Override // com.braze.models.IPutIntoJson
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public String forJsonPut() {
        int i10 = a.f20921a[ordinal()];
        if (i10 == 1) {
            return "subscribed";
        }
        if (i10 == 2) {
            return "unsubscribed";
        }
        throw new NoWhenBranchMatchedException();
    }
}
