package p199q0;

import A0.f;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.app.F;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: ShortcutInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f45961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent[] f45962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ComponentName f45963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f45964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f45965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f45966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IconCompat f45967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public F[] f45968i;
    public Set<String> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p186p0.b f45969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f45971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PersistableBundle f45972n;

    /* JADX INFO: compiled from: ShortcutInfoCompat.java */
    public static class a {
        public static void a(ShortcutInfo.Builder builder) {
            builder.setExcludedFromSurfaces(0);
        }
    }

    /* JADX INFO: compiled from: ShortcutInfoCompat.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f45973a;

        public b(Context context, ShortcutInfo shortcutInfo) {
            F[] fArr;
            String string;
            c cVar = new c();
            this.f45973a = cVar;
            cVar.f45960a = context;
            cVar.f45961b = shortcutInfo.getId();
            shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            cVar.f45962c = (Intent[]) Arrays.copyOf(intents, intents.length);
            cVar.f45963d = shortcutInfo.getActivity();
            cVar.f45964e = shortcutInfo.getShortLabel();
            cVar.f45965f = shortcutInfo.getLongLabel();
            cVar.f45966g = shortcutInfo.getDisabledMessage();
            if (Build.VERSION.SDK_INT >= 28) {
                shortcutInfo.getDisabledReason();
            } else {
                shortcutInfo.isEnabled();
            }
            cVar.j = shortcutInfo.getCategories();
            PersistableBundle extras = shortcutInfo.getExtras();
            p186p0.b bVar = null;
            if (extras == null || !extras.containsKey("extraPersonCount")) {
                fArr = null;
            } else {
                int i10 = extras.getInt("extraPersonCount");
                fArr = new F[i10];
                int i11 = 0;
                while (i11 < i10) {
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i12 = i11 + 1;
                    sb2.append(i12);
                    fArr[i11] = F.a.a(extras.getPersistableBundle(sb2.toString()));
                    i11 = i12;
                }
            }
            cVar.f45968i = fArr;
            c cVar2 = this.f45973a;
            shortcutInfo.getUserHandle();
            cVar2.getClass();
            c cVar3 = this.f45973a;
            shortcutInfo.getLastChangedTimestamp();
            cVar3.getClass();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30) {
                c cVar4 = this.f45973a;
                shortcutInfo.isCached();
                cVar4.getClass();
            }
            c cVar5 = this.f45973a;
            shortcutInfo.isDynamic();
            cVar5.getClass();
            c cVar6 = this.f45973a;
            shortcutInfo.isPinned();
            cVar6.getClass();
            c cVar7 = this.f45973a;
            shortcutInfo.isDeclaredInManifest();
            cVar7.getClass();
            c cVar8 = this.f45973a;
            shortcutInfo.isImmutable();
            cVar8.getClass();
            c cVar9 = this.f45973a;
            shortcutInfo.isEnabled();
            cVar9.getClass();
            c cVar10 = this.f45973a;
            shortcutInfo.hasKeyFieldsOnly();
            cVar10.getClass();
            c cVar11 = this.f45973a;
            if (i13 < 29) {
                PersistableBundle extras2 = shortcutInfo.getExtras();
                if (extras2 != null && (string = extras2.getString("extraLocusId")) != null) {
                    bVar = new p186p0.b(string);
                }
            } else if (shortcutInfo.getLocusId() != null) {
                LocusId locusId = shortcutInfo.getLocusId();
                f.f(locusId, "locusId cannot be null");
                String strB = p0.b.a.b(locusId);
                if (TextUtils.isEmpty(strB)) {
                    throw new IllegalArgumentException("id cannot be empty");
                }
                bVar = new p186p0.b(strB);
            }
            cVar11.f45969k = bVar;
            this.f45973a.f45971m = shortcutInfo.getRank();
            this.f45973a.f45972n = shortcutInfo.getExtras();
        }

        public final c a() {
            c cVar = this.f45973a;
            if (TextUtils.isEmpty(cVar.f45964e)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            Intent[] intentArr = cVar.f45962c;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            return cVar;
        }
    }

    public static ArrayList a(Context context, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new b(context, (ShortcutInfo) it.next()).a());
        }
        return arrayList;
    }

    public final ShortcutInfo b() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f45960a, this.f45961b).setShortLabel(this.f45964e).setIntents(this.f45962c);
        IconCompat iconCompat = this.f45967h;
        if (iconCompat != null) {
            intents.setIcon(IconCompat.a.f(iconCompat, this.f45960a));
        }
        if (!TextUtils.isEmpty(this.f45965f)) {
            intents.setLongLabel(this.f45965f);
        }
        if (!TextUtils.isEmpty(this.f45966g)) {
            intents.setDisabledMessage(this.f45966g);
        }
        ComponentName componentName = this.f45963d;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.j;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f45971m);
        PersistableBundle persistableBundle = this.f45972n;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            F[] fArr = this.f45968i;
            if (fArr != null && fArr.length > 0) {
                int length = fArr.length;
                Person[] personArr = new Person[length];
                while (i10 < length) {
                    F f10 = this.f45968i[i10];
                    f10.getClass();
                    personArr[i10] = F.b.b(f10);
                    i10++;
                }
                intents.setPersons(personArr);
            }
            p186p0.b bVar = this.f45969k;
            if (bVar != null) {
                intents.setLocusId(bVar.f45795b);
            }
            intents.setLongLived(this.f45970l);
        } else {
            if (this.f45972n == null) {
                this.f45972n = new PersistableBundle();
            }
            F[] fArr2 = this.f45968i;
            if (fArr2 != null && fArr2.length > 0) {
                this.f45972n.putInt("extraPersonCount", fArr2.length);
                while (i10 < this.f45968i.length) {
                    PersistableBundle persistableBundle2 = this.f45972n;
                    StringBuilder sb2 = new StringBuilder("extraPerson_");
                    int i11 = i10 + 1;
                    sb2.append(i11);
                    String string = sb2.toString();
                    F f11 = this.f45968i[i10];
                    f11.getClass();
                    persistableBundle2.putPersistableBundle(string, F.a.b(f11));
                    i10 = i11;
                }
            }
            p186p0.b bVar2 = this.f45969k;
            if (bVar2 != null) {
                this.f45972n.putString("extraLocusId", bVar2.f45794a);
            }
            this.f45972n.putBoolean("extraLongLived", this.f45970l);
            intents.setExtras(this.f45972n);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            a.a(intents);
        }
        return intents.build();
    }
}
