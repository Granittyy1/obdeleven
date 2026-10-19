package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.AbstractC1287b;
import androidx.core.view.S;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MenuBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class f implements p246u0.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f8457y = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f8459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f8462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<h> f8463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList<h> f8464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList<h> f8466i;
    public final ArrayList<h> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8467k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f8469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f8470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f8471o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h f8478v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f8480x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8468l = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8472p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8473q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8474r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8475s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList<h> f8476t = new ArrayList<>();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<j>> f8477u = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8479w = false;

    /* JADX INFO: compiled from: MenuBuilder.java */
    public interface a {
        boolean a(f fVar, MenuItem menuItem);

        void b(f fVar);
    }

    /* JADX INFO: compiled from: MenuBuilder.java */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        boolean zB;
        boolean z10 = false;
        this.f8458a = context;
        Resources resources = context.getResources();
        this.f8459b = resources;
        this.f8463f = new ArrayList<>();
        this.f8464g = new ArrayList<>();
        this.f8465h = true;
        this.f8466i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.f8467k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zB = S.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zB) {
                z10 = true;
            }
        }
        this.f8461d = z10;
    }

    public final h a(int i10, int i11, int i12, CharSequence charSequence) {
        int i13;
        int i14 = ((-65536) & i12) >> 16;
        if (i14 < 0 || i14 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i15 = (f8457y[i14] << 16) | (65535 & i12);
        h hVar = new h(this, i10, i11, i12, i15, charSequence, this.f8468l);
        ArrayList<h> arrayList = this.f8463f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f8490d <= i15) {
                i13 = size + 1;
                arrayList.add(i13, hVar);
                p(true);
                return hVar;
            }
        }
        i13 = 0;
        arrayList.add(i13, hVar);
        p(true);
        return hVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f8458a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            h hVarA = a(i10, i11, i12, resolveInfo.loadLabel(packageManager));
            hVarA.setIcon(resolveInfo.loadIcon(packageManager));
            hVarA.f8493g = intent2;
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = hVarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(j jVar, Context context) {
        this.f8477u.add(new WeakReference<>(jVar));
        jVar.g(context, this);
        this.f8467k = true;
    }

    public final void c(boolean z10) {
        if (this.f8475s) {
            return;
        }
        this.f8475s = true;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f8477u;
        for (WeakReference<j> weakReference : copyOnWriteArrayList) {
            j jVar = weakReference.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                jVar.c(this, z10);
            }
        }
        this.f8475s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        h hVar = this.f8478v;
        if (hVar != null) {
            d(hVar);
        }
        this.f8463f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f8470n = null;
        this.f8469m = null;
        this.f8471o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f8477u;
        boolean zF = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f8478v == hVar) {
            w();
            for (WeakReference<j> weakReference : copyOnWriteArrayList) {
                j jVar = weakReference.get();
                if (jVar != null) {
                    zF = jVar.f(hVar);
                    if (zF) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zF) {
                this.f8478v = null;
            }
        }
        return zF;
    }

    public boolean e(f fVar, MenuItem menuItem) {
        a aVar = this.f8462e;
        return aVar != null && aVar.a(fVar, menuItem);
    }

    public boolean f(h hVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f8477u;
        boolean zM = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference<j> weakReference : copyOnWriteArrayList) {
            j jVar = weakReference.get();
            if (jVar != null) {
                zM = jVar.m(hVar);
                if (zM) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zM) {
            this.f8478v = hVar;
        }
        return zM;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        ArrayList<h> arrayList = this.f8463f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (hVar.f8487a == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (menuItemFindItem = hVar.f8500o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final h g(int i10, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.f8476t;
        arrayList.clear();
        h(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zN = n();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            char c10 = zN ? hVar.j : hVar.f8494h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zN && c10 == '\b' && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i10) {
        return this.f8463f.get(i10);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    public final void h(ArrayList arrayList, int i10, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            ArrayList<h> arrayList2 = this.f8463f;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = arrayList2.get(i11);
                if (hVar.hasSubMenu()) {
                    hVar.f8500o.h(arrayList, i10, keyEvent);
                }
                char c10 = zN ? hVar.j : hVar.f8494h;
                if ((modifiers & 69647) == ((zN ? hVar.f8496k : hVar.f8495i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if (c10 != cArr[0] && c10 != cArr[2]) {
                        if (zN && c10 == '\b') {
                            if (i10 == 67) {
                            }
                        }
                    }
                    if (hVar.isEnabled()) {
                        arrayList.add(hVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f8480x) {
            return true;
        }
        ArrayList<h> arrayList = this.f8463f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (arrayList.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList<h> arrayListL = l();
        if (this.f8467k) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f8477u;
            boolean zD = false;
            for (WeakReference<j> weakReference : copyOnWriteArrayList) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zD |= jVar.d();
                }
            }
            ArrayList<h> arrayList = this.f8466i;
            ArrayList<h> arrayList2 = this.j;
            if (zD) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = arrayListL.get(i10);
                    if (hVar.f()) {
                        arrayList.add(hVar);
                    } else {
                        arrayList2.add(hVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f8467k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return g(i10, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList<h> l() {
        boolean z10 = this.f8465h;
        ArrayList<h> arrayList = this.f8464g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList<h> arrayList2 = this.f8463f;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = arrayList2.get(i10);
            if (hVar.isVisible()) {
                arrayList.add(hVar);
            }
        }
        this.f8465h = false;
        this.f8467k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f8479w;
    }

    public boolean n() {
        return this.f8460c;
    }

    public boolean o() {
        return this.f8461d;
    }

    public void p(boolean z10) {
        if (this.f8472p) {
            this.f8473q = true;
            if (z10) {
                this.f8474r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f8465h = true;
            this.f8467k = true;
        }
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f8477u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference<j> weakReference : copyOnWriteArrayList) {
            j jVar = weakReference.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                jVar.i();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i10, int i11) {
        return q(findItem(i10), null, i11);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        h hVarG = g(i10, keyEvent);
        boolean zQ = hVarG != null ? q(hVarG, null, i11) : false;
        if ((i11 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0054  */
    /* JADX WARN: Code duplicated, block: B:37:0x005b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x007e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00a6 A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, j jVar, int i10) {
        AbstractC1287b abstractC1287b;
        boolean zExpandActionView;
        AbstractC1287b abstractC1287b2;
        boolean z10;
        m mVar;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList;
        j jVar2;
        h hVar = (h) menuItem;
        boolean zK = false;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = hVar.f8501p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(hVar)) {
            f fVar = hVar.f8499n;
            if (fVar.e(fVar, hVar)) {
                zExpandActionView = true;
            } else {
                Intent intent = hVar.f8493g;
                if (intent != null) {
                    try {
                        fVar.f8458a.startActivity(intent);
                    } catch (ActivityNotFoundException e10) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                        abstractC1287b = hVar.f8484A;
                        if (abstractC1287b == null) {
                        }
                        zExpandActionView = false;
                        abstractC1287b2 = hVar.f8484A;
                        if (abstractC1287b2 == null) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        if (hVar.e()) {
                            zExpandActionView |= hVar.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (hVar.hasSubMenu()) {
                            if ((i10 & 4) == 0) {
                                c(false);
                            }
                            if (!hVar.hasSubMenu()) {
                                m mVar2 = new m(this.f8458a, this, hVar);
                                hVar.f8500o = mVar2;
                                mVar2.setHeaderTitle(hVar.f8491e);
                            }
                            mVar = hVar.f8500o;
                            if (z10) {
                                abstractC1287b2.f(mVar);
                            }
                            copyOnWriteArrayList = this.f8477u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (jVar != null) {
                                }
                                for (WeakReference<j> weakReference : copyOnWriteArrayList) {
                                    jVar2 = weakReference.get();
                                    if (jVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zK) {
                                        zK = jVar2.k(mVar);
                                    }
                                }
                            }
                            zExpandActionView |= zK;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i10 & 4) == 0) {
                                c(false);
                            }
                            if (!hVar.hasSubMenu()) {
                                m mVar3 = new m(this.f8458a, this, hVar);
                                hVar.f8500o = mVar3;
                                mVar3.setHeaderTitle(hVar.f8491e);
                            }
                            mVar = hVar.f8500o;
                            if (z10) {
                                abstractC1287b2.f(mVar);
                            }
                            copyOnWriteArrayList = this.f8477u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zK = jVar != null ? jVar.k(mVar) : false;
                                while (r8.hasNext()) {
                                    jVar2 = weakReference.get();
                                    if (jVar2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zK) {
                                        zK = jVar2.k(mVar);
                                    }
                                }
                            }
                            zExpandActionView |= zK;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    abstractC1287b = hVar.f8484A;
                    if (abstractC1287b == null && abstractC1287b.e()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        abstractC1287b2 = hVar.f8484A;
        if (abstractC1287b2 == null && abstractC1287b2.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (hVar.e()) {
            zExpandActionView |= hVar.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (hVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                c(false);
            }
            if (!hVar.hasSubMenu()) {
                m mVar4 = new m(this.f8458a, this, hVar);
                hVar.f8500o = mVar4;
                mVar4.setHeaderTitle(hVar.f8491e);
            }
            mVar = hVar.f8500o;
            if (z10) {
                abstractC1287b2.f(mVar);
            }
            copyOnWriteArrayList = this.f8477u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (jVar != null) {
                }
                while (r8.hasNext()) {
                    jVar2 = weakReference.get();
                    if (jVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zK) {
                        zK = jVar2.k(mVar);
                    }
                }
            }
            zExpandActionView |= zK;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i10 & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(j jVar) {
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.f8477u;
        for (WeakReference<j> weakReference : copyOnWriteArrayList) {
            j jVar2 = weakReference.get();
            if (jVar2 == null || jVar2 == jVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i10) {
        ArrayList<h> arrayList = this.f8463f;
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                i12 = -1;
                break;
            } else if (arrayList.get(i12).f8488b == i10) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 >= 0) {
            int size2 = arrayList.size() - i12;
            while (true) {
                int i13 = i11 + 1;
                if (i11 >= size2 || arrayList.get(i12).f8488b != i10) {
                    break;
                }
                if (i12 >= 0) {
                    ArrayList<h> arrayList2 = this.f8463f;
                    if (i12 < arrayList2.size()) {
                        arrayList2.remove(i12);
                    }
                }
                i11 = i13;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i10) {
        ArrayList<h> arrayList = this.f8463f;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (arrayList.get(i11).f8487a == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            ArrayList<h> arrayList2 = this.f8463f;
            if (i11 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i11);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f8463f.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).s(bundle);
            }
        }
        int i11 = bundle.getInt("android:menu:expandedactionview");
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i10, boolean z10, boolean z11) {
        ArrayList<h> arrayList = this.f8463f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (hVar.f8488b == i10) {
                hVar.g(z11);
                hVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f8479w = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i10, boolean z10) {
        ArrayList<h> arrayList = this.f8463f;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (hVar.f8488b == i10) {
                hVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i10, boolean z10) {
        ArrayList<h> arrayList = this.f8463f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            if (hVar.f8488b == i10) {
                int i12 = hVar.f8509x;
                int i13 = (i12 & (-9)) | (z10 ? 0 : 8);
                hVar.f8509x = i13;
                if (i12 != i13) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f8460c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f8463f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f8463f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        if (view != null) {
            this.f8471o = view;
            this.f8469m = null;
            this.f8470n = null;
        } else {
            if (i10 > 0) {
                this.f8469m = this.f8459b.getText(i10);
            } else if (charSequence != null) {
                this.f8469m = charSequence;
            }
            if (i11 > 0) {
                this.f8470n = p186p0.a.C0517a.b(this.f8458a, i11);
            } else if (drawable != null) {
                this.f8470n = drawable;
            }
            this.f8471o = null;
        }
        p(false);
    }

    public final void v() {
        this.f8472p = false;
        if (this.f8473q) {
            this.f8473q = false;
            p(this.f8474r);
        }
    }

    public final void w() {
        if (this.f8472p) {
            return;
        }
        this.f8472p = true;
        this.f8473q = false;
        this.f8474r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10) {
        return a(0, 0, 0, this.f8459b.getString(i10));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.f8459b.getString(i10));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h hVarA = a(i10, i11, i12, charSequence);
        m mVar = new m(this.f8458a, this, hVarA);
        hVarA.f8500o = mVar;
        mVar.setHeaderTitle(hVarA.f8491e);
        return mVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f8459b.getString(i13));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.f8459b.getString(i13));
    }

    public f k() {
        return this;
    }
}
