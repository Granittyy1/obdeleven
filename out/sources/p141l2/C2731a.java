package p141l2;

import android.app.Activity;
import android.content.Context;
import io.intercom.android.sdk.m5.navigation.X;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt__SequencesKt;
import p005a4.q;

/* JADX INFO: renamed from: l2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ActivityNavigator.android.kt */
/* JADX INFO: loaded from: classes.dex */
@P.b("activity")
public class C2731a extends P<C0504a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f44282c;

    /* JADX INFO: renamed from: l2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityNavigator.android.kt */
    public static class C0504a extends C {
        public C0504a() {
            throw null;
        }

        @Override // p141l2.C
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C0504a)) {
                return false;
            }
            if (super.equals(obj)) {
                if (i.a(null, null)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p141l2.C
        public final int hashCode() {
            return super.hashCode() * 961;
        }
    }

    public C2731a(Context context) {
        i.e(context, "context");
        for (Object obj : SequencesKt__SequencesKt.z(context, new X(3))) {
            if (((Context) obj) instanceof Activity) {
                this.f44282c = (Activity) obj;
            }
        }
        obj = null;
        this.f44282c = (Activity) obj;
    }

    @Override // p141l2.P
    public final C a() {
        return new C0504a(this);
    }

    @Override // p141l2.P
    public final C c(C c10) {
        throw new IllegalStateException(q.c(new StringBuilder("Destination "), ((C0504a) c10).f44219c.f44813d, " does not have an Intent set.").toString());
    }

    @Override // p141l2.P
    public final boolean f() {
        Activity activity = this.f44282c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
