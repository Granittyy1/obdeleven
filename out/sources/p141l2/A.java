package p141l2;

import C7.g;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.J;
import io.intercom.android.sdk.m5.conversation.ui.Q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.q;
import kotlin.jvm.internal.i;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.n;
import p050db.j;
import p163n2.e;
import p163n2.l;

/* JADX INFO: compiled from: NavDeepLinkBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f44207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f44208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f44209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E f44210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f44211e;

    /* JADX INFO: compiled from: NavDeepLinkBuilder.android.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f44212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bundle f44213b;

        public a(int i10, Bundle bundle) {
            this.f44212a = i10;
            this.f44213b = bundle;
        }
    }

    public A(H navController) {
        Intent launchIntentForPackage;
        i.e(navController, "navController");
        Context context = navController.f44309a;
        i.e(context, "context");
        this.f44207a = context;
        this.f44208b = new e(context);
        kotlin.sequences.e.a aVar = new kotlin.sequences.e.a(SequencesKt___SequencesKt.D(new n(SequencesKt__SequencesKt.z(context, new Q(2)), new j(2))));
        Activity activity = (Activity) (!aVar.hasNext() ? null : aVar.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f44209c = launchIntentForPackage;
        this.f44211e = new ArrayList();
        this.f44210d = navController.f44310b.i();
    }

    public final J a() {
        E e10 = this.f44210d;
        if (e10 == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList = this.f44211e;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        C c10 = null;
        while (true) {
            int i10 = 0;
            if (!it.hasNext()) {
                int[] iArrN0 = q.n0(arrayList2);
                Intent intent = this.f44209c;
                intent.putExtra("android-support-nav:controller:deepLinkIds", iArrN0);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                J j = new J(this.f44207a);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(j.f16694c.getPackageManager());
                }
                if (component != null) {
                    j.d(component);
                }
                ArrayList<Intent> arrayList4 = j.f16693b;
                arrayList4.add(intent2);
                int size = arrayList4.size();
                while (i10 < size) {
                    Intent intent3 = arrayList4.get(i10);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i10++;
                }
                return j;
            }
            a aVar = (a) it.next();
            int i11 = aVar.f44212a;
            C cB = b(i11);
            if (cB == null) {
                int i12 = C.f44217f;
                throw new IllegalArgumentException("Navigation destination " + C.a.b(this.f44208b, i11) + " cannot be found in the navigation graph " + e10);
            }
            int[] iArrK = cB.k(c10);
            int length = iArrK.length;
            while (i10 < length) {
                arrayList2.add(Integer.valueOf(iArrK[i10]));
                arrayList3.add(aVar.f44213b);
                i10++;
            }
            c10 = cB;
        }
    }

    public final C b(int i10) {
        kotlin.collections.i iVar = new kotlin.collections.i();
        E e10 = this.f44210d;
        i.b(e10);
        iVar.addLast(e10);
        while (!iVar.isEmpty()) {
            C c10 = (C) iVar.removeFirst();
            if (c10.f44219c.f44813d == i10) {
                return c10;
            }
            if (c10 instanceof E) {
                Iterator<C> it = ((E) c10).iterator();
                while (true) {
                    l lVar = (l) it;
                    if (lVar.hasNext()) {
                        iVar.addLast((C) lVar.next());
                    }
                }
            }
        }
        return null;
    }

    public final void c() {
        Iterator it = this.f44211e.iterator();
        while (it.hasNext()) {
            int i10 = ((a) it.next()).f44212a;
            if (b(i10) == null) {
                int i11 = C.f44217f;
                StringBuilder sbA = g.a("Navigation destination ", C.a.b(this.f44208b, i10), " cannot be found in the navigation graph ");
                sbA.append(this.f44210d);
                throw new IllegalArgumentException(sbA.toString());
            }
        }
    }
}
