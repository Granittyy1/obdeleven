package p141l2;

import C.e;
import C7.g;
import io.intercom.android.sdk.m5.conversation.ui.C2405u;
import io.intercom.android.sdk.m5.conversation.ui.C2406v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.a;
import kotlin.jvm.internal.i;
import kotlin.text.n;
import p141l2.C;
import p163n2.k;

/* JADX INFO: compiled from: NavDestinationBuilder.android.kt */
/* JADX INFO: loaded from: classes.dex */
public class D<D extends C> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P<? extends D> f44228a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44230c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44229b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f44231d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f44232e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f44233f = new LinkedHashMap();

    public D(P<? extends D> p10, String str) {
        this.f44228a = p10;
        this.f44230c = str;
    }

    public D a() {
        k kVar;
        int i10 = 2;
        D d10 = (D) b();
        d10.getClass();
        Iterator it = this.f44231d.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kVar = d10.f44219c;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String argumentName = (String) entry.getKey();
            r argument = (r) entry.getValue();
            i.e(argumentName, "argumentName");
            i.e(argument, "argument");
            kVar.getClass();
            kVar.f44812c.put(argumentName, argument);
        }
        for (z navDeepLink : this.f44232e) {
            i.e(navDeepLink, "navDeepLink");
            kVar.getClass();
            ArrayList arrayListJ = e.j(kVar.f44812c, new C2405u(i10, navDeepLink));
            if (!arrayListJ.isEmpty()) {
                throw new IllegalArgumentException(("Deep link " + navDeepLink.f44327a + " can't be used to open destination " + kVar.f44810a + ".\nFollowing required arguments are missing: " + arrayListJ).toString());
            }
            kVar.f44811b.add(navDeepLink);
        }
        for (Map.Entry entry2 : this.f44233f.entrySet()) {
            int iIntValue = ((Number) entry2.getKey()).intValue();
            C2747q action = (C2747q) entry2.getValue();
            i.e(action, "action");
            if (d10 instanceof C2731a.C0504a) {
                throw new UnsupportedOperationException("Cannot add action " + iIntValue + " to " + d10 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
            }
            if (iIntValue == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            d10.f44221e.e(iIntValue, action);
        }
        String str = this.f44230c;
        if (str != null) {
            kVar.getClass();
            if (n.S(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            int i11 = C.f44217f;
            String uriPattern = C.a.a(str);
            i.e(uriPattern, "uriPattern");
            ArrayList arrayListJ2 = e.j(kVar.f44812c, new C2406v(3, new z(uriPattern)));
            if (!arrayListJ2.isEmpty()) {
                StringBuilder sbA = g.a("Cannot set route \"", str, "\" for destination ");
                sbA.append(kVar.f44810a);
                sbA.append(". Following required arguments are missing: ");
                sbA.append(arrayListJ2);
                throw new IllegalArgumentException(sbA.toString().toString());
            }
            kVar.f44815f = a.a(new io.intercom.android.sdk.e(2, uriPattern));
            kVar.f44813d = uriPattern.hashCode();
            kVar.f44814e = str;
        }
        int i12 = this.f44229b;
        if (i12 != -1) {
            kVar.f44813d = i12;
        }
        return d10;
    }

    public D b() {
        return (D) this.f44228a.a();
    }
}
