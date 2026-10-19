package androidx.compose.ui.node;

import androidx.compose.runtime.InterfaceC1078c;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.internal.measurement.C1787c0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.random.Random;

/* JADX INFO: compiled from: UiApplier.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements InterfaceC1078c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f14582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f14583c;

    public f0(Collection collection) {
        String strC = androidx.compose.animation.D.c("randomUUID().toString()");
        Na.i iVar = new Na.i(43, 128, 1);
        Random.Default random = Random.f43064b;
        kotlin.jvm.internal.i.e(random, "random");
        try {
            int iQ = C1787c0.q(random, iVar);
            ArrayList arrayListD0 = kotlin.collections.q.d0(kotlin.collections.q.d0(kotlin.collections.q.d0(kotlin.collections.q.d0(kotlin.collections.q.c0(kotlin.collections.q.b0(new Na.c('a', 'z'), new Na.c('A', 'Z')), new Na.c('0', '9')), '-'), '.'), '_'), '~');
            ArrayList arrayList = new ArrayList(iQ);
            for (int i10 = 0; i10 < iQ; i10++) {
                kotlin.jvm.internal.i.e(Random.f43064b, "random");
                if (arrayListD0.isEmpty()) {
                    throw new NoSuchElementException("Collection is empty.");
                }
                Character ch = (Character) arrayListD0.get(Random.f43065c.c(arrayListD0.size()));
                ch.getClass();
                arrayList.add(ch);
            }
            String strU = kotlin.collections.q.U(arrayList, "", null, null, null, 62);
            if (!((strC.length() == 0 ? false : !(kotlin.text.n.P(strC, ' ', 0, false, 6) >= 0)) && com.facebook.login.B.b(strU))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
            hashSet.add("openid");
            Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            kotlin.jvm.internal.i.d(setUnmodifiableSet, "unmodifiableSet(permissions)");
            this.f14581a = setUnmodifiableSet;
            this.f14582b = strC;
            this.f14583c = strU;
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public void a(int i10, Object obj) {
        ((LayoutNode) this.f14583c).L(i10, (LayoutNode) obj);
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public void b(Object obj) {
        ((ArrayList) this.f14582b).add(this.f14583c);
        this.f14583c = obj;
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public void c() {
        ((LayoutNode) this.f14583c).p();
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public void d(int i10, int i11, int i12) {
        ((LayoutNode) this.f14583c).T(i10, i11, i12);
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public void e(int i10, int i11) {
        ((LayoutNode) this.f14583c).Z(i10, i11);
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public void f() {
        ArrayList arrayList = (ArrayList) this.f14582b;
        this.f14583c = arrayList.remove(arrayList.size() - 1);
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public /* bridge */ /* synthetic */ void g(int i10, Object obj) {
    }

    @Override // androidx.compose.runtime.InterfaceC1078c
    public Object h() {
        return this.f14583c;
    }

    public void i() {
        ((ArrayList) this.f14582b).clear();
        this.f14583c = (LayoutNode) this.f14581a;
        ((LayoutNode) this.f14581a).Y();
    }

    public void j() {
        AndroidComposeView androidComposeView = ((LayoutNode) this.f14581a).f14412o;
        if (androidComposeView != null) {
            androidComposeView.F();
        }
    }

    public f0(LayoutNode layoutNode) {
        this.f14581a = layoutNode;
        this.f14582b = new ArrayList();
        this.f14583c = layoutNode;
    }
}
