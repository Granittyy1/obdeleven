package p138l;

import C7.g;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.D;
import androidx.appcompat.widget.c0;
import androidx.core.view.AbstractC1287b;
import androidx.core.view.r;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p150m.c;

/* JADX INFO: compiled from: SupportMenuInflater.java */
/* JADX INFO: loaded from: classes.dex */
public final class f extends MenuInflater {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f44059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f44060f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f44061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f44062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f44063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f44064d;

    /* JADX INFO: compiled from: SupportMenuInflater.java */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f44065c = {MenuItem.class};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f44066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Method f44067b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f44067b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f44066a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: SupportMenuInflater.java */
    public class b {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public CharSequence f44068A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public CharSequence f44069B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Menu f44073a;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f44080h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f44081i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public CharSequence f44082k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f44083l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f44084m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public char f44085n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f44086o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public char f44087p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f44088q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f44089r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f44090s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f44091t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f44092u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f44093v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f44094w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public String f44095x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f44096y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public AbstractC1287b f44097z;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public ColorStateList f44070C = null;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public PorterDuff.Mode f44071D = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44074b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f44075c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f44076d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44077e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f44078f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f44079g = true;

        public b(Menu menu) {
            this.f44073a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f44063c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception unused) {
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f44090s).setVisible(this.f44091t).setEnabled(this.f44092u).setCheckable(this.f44089r >= 1).setTitleCondensed(this.f44083l).setIcon(this.f44084m);
            int i10 = this.f44093v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            String str = this.f44096y;
            f fVar = f.this;
            if (str != null) {
                if (fVar.f44063c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (fVar.f44064d == null) {
                    fVar.f44064d = f.a(fVar.f44063c);
                }
                Object obj = fVar.f44064d;
                String str2 = this.f44096y;
                a aVar = new a();
                aVar.f44066a = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar.f44067b = cls.getMethod(str2, a.f44065c);
                    menuItem.setOnMenuItemClickListener(aVar);
                } catch (Exception e10) {
                    StringBuilder sbA = g.a("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    sbA.append(cls.getName());
                    InflateException inflateException = new InflateException(sbA.toString());
                    inflateException.initCause(e10);
                    throw inflateException;
                }
            }
            if (this.f44089r >= 2) {
                if (menuItem instanceof h) {
                    ((h) menuItem).g(true);
                } else if (menuItem instanceof c) {
                    c cVar = (c) menuItem;
                    try {
                        Method method = cVar.f44538e;
                        p246u0.b bVar = cVar.f44537d;
                        if (method == null) {
                            cVar.f44538e = bVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        cVar.f44538e.invoke(bVar, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
            String str3 = this.f44095x;
            if (str3 != null) {
                menuItem.setActionView((View) a(str3, f.f44059e, fVar.f44061a));
                z10 = true;
            }
            int i11 = this.f44094w;
            if (i11 > 0 && !z10) {
                menuItem.setActionView(i11);
            }
            AbstractC1287b abstractC1287b = this.f44097z;
            if (abstractC1287b != null && (menuItem instanceof p246u0.b)) {
                ((p246u0.b) menuItem).a(abstractC1287b);
            }
            CharSequence charSequence = this.f44068A;
            boolean z11 = menuItem instanceof p246u0.b;
            if (z11) {
                ((p246u0.b) menuItem).setContentDescription(charSequence);
            } else {
                r.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.f44069B;
            if (z11) {
                ((p246u0.b) menuItem).setTooltipText(charSequence2);
            } else {
                r.m(menuItem, charSequence2);
            }
            char c10 = this.f44085n;
            int i12 = this.f44086o;
            if (z11) {
                ((p246u0.b) menuItem).setAlphabeticShortcut(c10, i12);
            } else {
                r.g(menuItem, c10, i12);
            }
            char c11 = this.f44087p;
            int i13 = this.f44088q;
            if (z11) {
                ((p246u0.b) menuItem).setNumericShortcut(c11, i13);
            } else {
                r.k(menuItem, c11, i13);
            }
            PorterDuff.Mode mode = this.f44071D;
            if (mode != null) {
                if (z11) {
                    ((p246u0.b) menuItem).setIconTintMode(mode);
                } else {
                    r.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.f44070C;
            if (colorStateList != null) {
                if (z11) {
                    ((p246u0.b) menuItem).setIconTintList(colorStateList);
                } else {
                    r.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f44059e = clsArr;
        f44060f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f44063c = context;
        Object[] objArr = {context};
        this.f44061a = objArr;
        this.f44062b = objArr;
    }

    public static Object a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [l.f] */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r10;
        int i10;
        ?? r11;
        ColorStateList colorStateList;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r10 = 1;
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == r10) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i10) {
                if (!z11) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    f fVar = f.this;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = fVar.f44063c.obtainStyledAttributes(attributeSet, p088h.a.f35704q);
                        bVar.f44074b = ObtainStyledAttributes.getResourceId(r10, 0);
                        bVar.f44075c = ObtainStyledAttributes.getInt(3, 0);
                        bVar.f44076d = ObtainStyledAttributes.getInt(4, 0);
                        bVar.f44077e = ObtainStyledAttributes.getInt(5, 0);
                        bVar.f44078f = ObtainStyledAttributes.getBoolean(2, r10);
                        bVar.f44079g = ObtainStyledAttributes.getBoolean(0, r10);
                        ObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        c0 c0VarE = c0.e(fVar.f44063c, attributeSet, p088h.a.f35705r);
                        TypedArray typedArray = c0VarE.f8929b;
                        bVar.f44081i = typedArray.getResourceId(2, 0);
                        bVar.j = (typedArray.getInt(5, bVar.f44075c) & (-65536)) | (typedArray.getInt(6, bVar.f44076d) & 65535);
                        bVar.f44082k = typedArray.getText(7);
                        bVar.f44083l = typedArray.getText(8);
                        bVar.f44084m = typedArray.getResourceId(0, 0);
                        String string = typedArray.getString(9);
                        bVar.f44085n = string == null ? (char) 0 : string.charAt(0);
                        bVar.f44086o = typedArray.getInt(16, 4096);
                        String string2 = typedArray.getString(10);
                        bVar.f44087p = string2 == null ? (char) 0 : string2.charAt(0);
                        bVar.f44088q = typedArray.getInt(20, 4096);
                        if (typedArray.hasValue(11)) {
                            bVar.f44089r = typedArray.getBoolean(11, false) ? 1 : 0;
                        } else {
                            bVar.f44089r = bVar.f44077e;
                        }
                        bVar.f44090s = typedArray.getBoolean(3, false);
                        bVar.f44091t = typedArray.getBoolean(4, bVar.f44078f);
                        bVar.f44092u = typedArray.getBoolean(1, bVar.f44079g);
                        bVar.f44093v = typedArray.getInt(21, -1);
                        bVar.f44096y = typedArray.getString(12);
                        bVar.f44094w = typedArray.getResourceId(13, 0);
                        bVar.f44095x = typedArray.getString(15);
                        String string3 = typedArray.getString(14);
                        if (string3 != null && bVar.f44094w == 0 && bVar.f44095x == null) {
                            bVar.f44097z = (AbstractC1287b) bVar.a(string3, f44060f, fVar.f44062b);
                        } else {
                            bVar.f44097z = null;
                        }
                        bVar.f44068A = typedArray.getText(17);
                        bVar.f44069B = typedArray.getText(22);
                        if (typedArray.hasValue(19)) {
                            bVar.f44071D = D.b(typedArray.getInt(19, -1), bVar.f44071D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar.f44071D = null;
                        }
                        if (typedArray.hasValue(18)) {
                            bVar.f44070C = c0VarE.a(18);
                        } else {
                            bVar.f44070C = colorStateList;
                        }
                        c0VarE.g();
                        bVar.f44080h = false;
                        r11 = 1;
                    } else if (name2.equals("menu")) {
                        r11 = 1;
                        bVar.f44080h = true;
                        SubMenu subMenuAddSubMenu = bVar.f44073a.addSubMenu(bVar.f44074b, bVar.f44081i, bVar.j, bVar.f44082k);
                        bVar.b(subMenuAddSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        r11 = 1;
                        str = name2;
                        z11 = true;
                    }
                }
                r11 = r10;
                z10 = z10;
            } else if (eventType != 3) {
                r11 = r10;
                z10 = z10;
            } else {
                String name3 = xmlResourceParser.getName();
                if (z11 && name3.equals(str)) {
                    r11 = r10;
                    z11 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        bVar.f44074b = 0;
                        bVar.f44075c = 0;
                        bVar.f44076d = 0;
                        bVar.f44077e = 0;
                        bVar.f44078f = r10;
                        bVar.f44079g = r10;
                    } else if (name3.equals("item")) {
                        if (!bVar.f44080h) {
                            AbstractC1287b abstractC1287b = bVar.f44097z;
                            if (abstractC1287b == null || !abstractC1287b.a()) {
                                bVar.f44080h = r10;
                                bVar.b(bVar.f44073a.add(bVar.f44074b, bVar.f44081i, bVar.j, bVar.f44082k));
                            } else {
                                bVar.f44080h = r10;
                                bVar.b(bVar.f44073a.addSubMenu(bVar.f44074b, bVar.f44081i, bVar.j, bVar.f44082k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        ?? r12 = r10;
                        z10 = r12 == true ? 1 : 0;
                        r11 = r12;
                    }
                    r11 = r10;
                    z10 = z10;
                }
            }
            eventType = xmlResourceParser.next();
            r10 = r11;
            i10 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof p246u0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z10 = false;
        try {
            try {
                layout = this.f44063c.getResources().getLayout(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof androidx.appcompat.view.menu.f) {
                    androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) menu;
                    if (!fVar.f8472p) {
                        fVar.w();
                        z10 = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z10) {
                    ((androidx.appcompat.view.menu.f) menu).v();
                }
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th) {
            if (z10) {
                ((androidx.appcompat.view.menu.f) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
