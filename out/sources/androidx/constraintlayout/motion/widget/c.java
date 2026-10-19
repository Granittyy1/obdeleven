package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.voltasit.obdeleven.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p126k0.g;
import p126k0.l;
import p126k0.n;
import p126k0.q;
import p126k0.t;

/* JADX INFO: compiled from: ViewTransition.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16324a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f16329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.constraintlayout.widget.b.a f16330g;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f16333k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Context f16337o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16325b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16326c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16327d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16331h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16332i = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16334l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f16335m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16336n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16338p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16339q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16340r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16341s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16342t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16343u = -1;

    /* JADX INFO: compiled from: ViewTransition.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f16345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final n f16346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f16347d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final d f16349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Interpolator f16350g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f16352i;
        public float j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f16355m;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final F6.a f16348e = new F6.a(4);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f16351h = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Rect f16354l = new Rect();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f16353k = System.nanoTime();

        public a(d dVar, n nVar, int i10, int i11, int i12, Interpolator interpolator, int i13, int i14) {
            this.f16355m = false;
            this.f16349f = dVar;
            this.f16346c = nVar;
            this.f16347d = i11;
            if (dVar.f16360e == null) {
                dVar.f16360e = new ArrayList<>();
            }
            dVar.f16360e.add(this);
            this.f16350g = interpolator;
            this.f16344a = i13;
            this.f16345b = i14;
            if (i12 == 3) {
                this.f16355m = true;
            }
            this.j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            a();
        }

        public final void a() {
            boolean z10 = this.f16351h;
            d dVar = this.f16349f;
            Interpolator interpolator = this.f16350g;
            n nVar = this.f16346c;
            int i10 = this.f16345b;
            int i11 = this.f16344a;
            if (z10) {
                long jNanoTime = System.nanoTime();
                long j = jNanoTime - this.f16353k;
                this.f16353k = jNanoTime;
                float f10 = this.f16352i - (((float) (j * 1.0E-6d)) * this.j);
                this.f16352i = f10;
                if (f10 < 0.0f) {
                    this.f16352i = 0.0f;
                }
                boolean zD = nVar.d(interpolator == null ? this.f16352i : interpolator.getInterpolation(this.f16352i), jNanoTime, this.f16348e, nVar.f41340b);
                if (this.f16352i <= 0.0f) {
                    if (i11 != -1) {
                        nVar.f41340b.setTag(i11, Long.valueOf(System.nanoTime()));
                    }
                    if (i10 != -1) {
                        nVar.f41340b.setTag(i10, null);
                    }
                    dVar.f16361f.add(this);
                }
                if (this.f16352i > 0.0f || zD) {
                    dVar.f16356a.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j10 = jNanoTime2 - this.f16353k;
            this.f16353k = jNanoTime2;
            float f11 = (((float) (j10 * 1.0E-6d)) * this.j) + this.f16352i;
            this.f16352i = f11;
            if (f11 >= 1.0f) {
                this.f16352i = 1.0f;
            }
            boolean zD2 = nVar.d(interpolator == null ? this.f16352i : interpolator.getInterpolation(this.f16352i), jNanoTime2, this.f16348e, nVar.f41340b);
            if (this.f16352i >= 1.0f) {
                if (i11 != -1) {
                    nVar.f41340b.setTag(i11, Long.valueOf(System.nanoTime()));
                }
                if (i10 != -1) {
                    nVar.f41340b.setTag(i10, null);
                }
                if (!this.f16355m) {
                    dVar.f16361f.add(this);
                }
            }
            if (this.f16352i < 1.0f || zD2) {
                dVar.f16356a.invalidate();
            }
        }

        public final void b() {
            this.f16351h = true;
            int i10 = this.f16347d;
            if (i10 != -1) {
                this.j = i10 == 0 ? Float.MAX_VALUE : 1.0f / i10;
            }
            this.f16349f.f16356a.invalidate();
            this.f16353k = System.nanoTime();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public c(Context context, XmlResourceParser xmlResourceParser) {
        byte b10;
        this.f16337o = context;
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                b10 = -1;
                            } else {
                                b10 = 2;
                            }
                            break;
                        case -1239391468:
                            if (!name.equals("KeyFrameSet")) {
                                b10 = -1;
                            } else {
                                b10 = 1;
                            }
                            break;
                        case 61998586:
                            if (!name.equals("ViewTransition")) {
                                b10 = -1;
                            } else {
                                b10 = 0;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                b10 = -1;
                            } else {
                                b10 = 4;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                b10 = -1;
                            } else {
                                b10 = 3;
                            }
                            break;
                        default:
                            b10 = -1;
                            break;
                    }
                    if (b10 == 0) {
                        d(context, xmlResourceParser);
                    } else if (b10 == 1) {
                        this.f16329f = new g(context, xmlResourceParser);
                    } else if (b10 == 2) {
                        this.f16330g = androidx.constraintlayout.widget.b.d(context, xmlResourceParser);
                    } else if (b10 == 3 || b10 == 4) {
                        ConstraintAttribute.d(context, xmlResourceParser, this.f16330g.f16495g);
                    } else {
                        Log.e("ViewTransition", p126k0.a.a() + " unknown tag " + name);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(".xml:");
                        sb2.append(xmlResourceParser.getLineNumber());
                        Log.e("ViewTransition", sb2.toString());
                    }
                } else if (eventType == 3 && "ViewTransition".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            Log.e("ViewTransition", "Error parsing XML resource", e10);
        } catch (XmlPullParserException e11) {
            Log.e("ViewTransition", "Error parsing XML resource", e11);
        }
    }

    public final void a(d dVar, MotionLayout motionLayout, int i10, androidx.constraintlayout.widget.b bVar, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolator;
        if (this.f16326c) {
            return;
        }
        int i11 = this.f16328e;
        g gVar = this.f16329f;
        if (i11 != 2) {
            androidx.constraintlayout.widget.b.a aVar = this.f16330g;
            if (i11 == 1) {
                for (int i12 : motionLayout.getConstraintSetIds()) {
                    if (i12 != i10) {
                        androidx.constraintlayout.motion.widget.a aVar2 = motionLayout.f16199r;
                        androidx.constraintlayout.widget.b bVarB = aVar2 == null ? null : aVar2.b(i12);
                        for (View view : viewArr) {
                            androidx.constraintlayout.widget.b.a aVarI = bVarB.i(view.getId());
                            if (aVar != null) {
                                androidx.constraintlayout.widget.b.a.C0169a c0169a = aVar.f16496h;
                                if (c0169a != null) {
                                    c0169a.e(aVarI);
                                }
                                aVarI.f16495g.putAll(aVar.f16495g);
                            }
                        }
                    }
                }
            }
            androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
            HashMap<Integer, androidx.constraintlayout.widget.b.a> map = bVar2.f16488g;
            map.clear();
            for (Integer num : bVar.f16488g.keySet()) {
                androidx.constraintlayout.widget.b.a aVar3 = bVar.f16488g.get(num);
                if (aVar3 != null) {
                    map.put(num, aVar3.clone());
                }
            }
            for (View view2 : viewArr) {
                androidx.constraintlayout.widget.b.a aVarI2 = bVar2.i(view2.getId());
                if (aVar != null) {
                    androidx.constraintlayout.widget.b.a.C0169a c0169a2 = aVar.f16496h;
                    if (c0169a2 != null) {
                        c0169a2.e(aVarI2);
                    }
                    aVarI2.f16495g.putAll(aVar.f16495g);
                }
            }
            motionLayout.F(i10, bVar2);
            motionLayout.F(R.id.view_transition, bVar);
            motionLayout.B(R.id.view_transition);
            androidx.constraintlayout.motion.widget.a.b bVar3 = new androidx.constraintlayout.motion.widget.a.b(motionLayout.f16199r, i10);
            for (View view3 : viewArr) {
                int i13 = this.f16331h;
                if (i13 != -1) {
                    bVar3.f16280h = Math.max(i13, 8);
                }
                bVar3.f16287p = this.f16327d;
                int i14 = this.f16334l;
                String str = this.f16335m;
                int i15 = this.f16336n;
                bVar3.f16277e = i14;
                bVar3.f16278f = str;
                bVar3.f16279g = i15;
                int id = view3.getId();
                if (gVar != null) {
                    ArrayList<p126k0.d> arrayList = gVar.f41266a.get(-1);
                    g gVar2 = new g();
                    Iterator<p126k0.d> it = arrayList.iterator();
                    while (it.hasNext()) {
                        p126k0.d dVarClone = it.next().clone();
                        dVarClone.f41228b = id;
                        gVar2.b(dVarClone);
                    }
                    bVar3.f16282k.add(gVar2);
                }
            }
            motionLayout.setTransition(bVar3);
            I4.c cVar = new I4.c(this, 2, viewArr);
            motionLayout.r(1.0f);
            motionLayout.f16175K0 = cVar;
            return;
        }
        View view4 = viewArr[0];
        n nVar = new n(view4);
        q qVar = nVar.f41344f;
        qVar.f41370d = 0.0f;
        qVar.f41371e = 0.0f;
        nVar.f41338H = true;
        qVar.d(view4.getX(), view4.getY(), view4.getWidth(), view4.getHeight());
        nVar.f41345g.d(view4.getX(), view4.getY(), view4.getWidth(), view4.getHeight());
        l lVar = nVar.f41346h;
        lVar.getClass();
        view4.getX();
        view4.getY();
        view4.getWidth();
        view4.getHeight();
        lVar.f41316d = view4.getVisibility();
        lVar.f41318f = view4.getVisibility() != 0 ? 0.0f : view4.getAlpha();
        lVar.f41319g = view4.getElevation();
        lVar.f41320h = view4.getRotation();
        lVar.f41321i = view4.getRotationX();
        lVar.f41314b = view4.getRotationY();
        lVar.j = view4.getScaleX();
        lVar.f41322k = view4.getScaleY();
        lVar.f41323l = view4.getPivotX();
        lVar.f41324m = view4.getPivotY();
        lVar.f41325n = view4.getTranslationX();
        lVar.f41326o = view4.getTranslationY();
        lVar.f41327p = view4.getTranslationZ();
        l lVar2 = nVar.f41347i;
        lVar2.getClass();
        view4.getX();
        view4.getY();
        view4.getWidth();
        view4.getHeight();
        lVar2.f41316d = view4.getVisibility();
        lVar2.f41318f = view4.getVisibility() == 0 ? view4.getAlpha() : 0.0f;
        lVar2.f41319g = view4.getElevation();
        lVar2.f41320h = view4.getRotation();
        lVar2.f41321i = view4.getRotationX();
        lVar2.f41314b = view4.getRotationY();
        lVar2.j = view4.getScaleX();
        lVar2.f41322k = view4.getScaleY();
        lVar2.f41323l = view4.getPivotX();
        lVar2.f41324m = view4.getPivotY();
        lVar2.f41325n = view4.getTranslationX();
        lVar2.f41326o = view4.getTranslationY();
        lVar2.f41327p = view4.getTranslationZ();
        ArrayList<p126k0.d> arrayList2 = gVar.f41266a.get(-1);
        if (arrayList2 != null) {
            nVar.f41360w.addAll(arrayList2);
        }
        nVar.g(System.nanoTime(), motionLayout.getWidth(), motionLayout.getHeight());
        int i16 = this.f16331h;
        int i17 = this.f16332i;
        int i18 = this.f16325b;
        Context context = motionLayout.getContext();
        int i19 = this.f16334l;
        if (i19 == -2) {
            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.f16336n);
        } else if (i19 == -1) {
            interpolatorLoadInterpolator = new t(p077g0.c.c(this.f16335m));
        } else if (i19 == 0) {
            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
        } else if (i19 == 1) {
            interpolatorLoadInterpolator = new AccelerateInterpolator();
        } else if (i19 == 2) {
            interpolatorLoadInterpolator = new DecelerateInterpolator();
        } else if (i19 == 4) {
            interpolatorLoadInterpolator = new BounceInterpolator();
        } else {
            if (i19 != 5) {
                if (i19 != 6) {
                    interpolator = null;
                } else {
                    interpolatorLoadInterpolator = new AnticipateInterpolator();
                }
                new a(dVar, nVar, i16, i17, i18, interpolator, this.f16338p, this.f16339q);
            }
            interpolatorLoadInterpolator = new OvershootInterpolator();
        }
        interpolator = interpolatorLoadInterpolator;
        new a(dVar, nVar, i16, i17, i18, interpolator, this.f16338p, this.f16339q);
    }

    public final boolean b(View view) {
        int i10 = this.f16340r;
        boolean z10 = i10 == -1 || view.getTag(i10) != null;
        int i11 = this.f16341s;
        return z10 && (i11 == -1 || view.getTag(i11) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.f16333k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.f16333k != null && (view.getLayoutParams() instanceof ConstraintLayout.a) && (str = ((ConstraintLayout.a) view.getLayoutParams()).f16419Y) != null && str.matches(this.f16333k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p139l0.d.f44145x);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f16324a = typedArrayObtainStyledAttributes.getResourceId(index, this.f16324a);
            } else if (index == 8) {
                if (MotionLayout.f16153U0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.f16333k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.f16333k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.f16325b = typedArrayObtainStyledAttributes.getInt(index, this.f16325b);
            } else if (index == 12) {
                this.f16326c = typedArrayObtainStyledAttributes.getBoolean(index, this.f16326c);
            } else if (index == 10) {
                this.f16327d = typedArrayObtainStyledAttributes.getInt(index, this.f16327d);
            } else if (index == 4) {
                this.f16331h = typedArrayObtainStyledAttributes.getInt(index, this.f16331h);
            } else if (index == 13) {
                this.f16332i = typedArrayObtainStyledAttributes.getInt(index, this.f16332i);
            } else if (index == 14) {
                this.f16328e = typedArrayObtainStyledAttributes.getInt(index, this.f16328e);
            } else if (index == 7) {
                int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i11 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.f16336n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f16334l = -2;
                    }
                } else if (i11 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f16335m = string;
                    if (string == null || string.indexOf("/") <= 0) {
                        this.f16334l = -1;
                    } else {
                        this.f16336n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f16334l = -2;
                    }
                } else {
                    this.f16334l = typedArrayObtainStyledAttributes.getInteger(index, this.f16334l);
                }
            } else if (index == 11) {
                this.f16338p = typedArrayObtainStyledAttributes.getResourceId(index, this.f16338p);
            } else if (index == 3) {
                this.f16339q = typedArrayObtainStyledAttributes.getResourceId(index, this.f16339q);
            } else if (index == 6) {
                this.f16340r = typedArrayObtainStyledAttributes.getResourceId(index, this.f16340r);
            } else if (index == 5) {
                this.f16341s = typedArrayObtainStyledAttributes.getResourceId(index, this.f16341s);
            } else if (index == 2) {
                this.f16343u = typedArrayObtainStyledAttributes.getResourceId(index, this.f16343u);
            } else if (index == 1) {
                this.f16342t = typedArrayObtainStyledAttributes.getInteger(index, this.f16342t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + p126k0.a.c(this.f16337o, this.f16324a) + ")";
    }
}
