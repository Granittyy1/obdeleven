package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.voltasit.obdeleven.R;
import io.intercom.android.sdk.carousel.CarouselScreenFragment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p126k0.g;
import p126k0.n;
import p139l0.f;

/* JADX INFO: compiled from: MotionScene.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionLayout f16254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f16255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f16256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<b> f16257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f16258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<b> f16259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SparseArray<androidx.constraintlayout.widget.b> f16260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<String, Integer> f16261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SparseIntArray f16262i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MotionEvent f16264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f16265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MotionLayout.f f16267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f16268p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f16269q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f16270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f16271s;

    /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MotionScene.java */
    public class InterpolatorC0166a implements Interpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p077g0.c f16272a;

        public InterpolatorC0166a(p077g0.c cVar) {
            this.f16272a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            return (float) this.f16272a.a(f10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public a(Context context, MotionLayout motionLayout, int i10) {
        this.f16255b = null;
        this.f16256c = null;
        ArrayList<b> arrayList = new ArrayList<>();
        this.f16257d = arrayList;
        this.f16258e = null;
        this.f16259f = new ArrayList<>();
        this.f16260g = new SparseArray<>();
        this.f16261h = new HashMap<>();
        this.f16262i = new SparseIntArray();
        this.j = CarouselScreenFragment.CAROUSEL_ANIMATION_MS;
        this.f16263k = 0;
        this.f16265m = false;
        this.f16266n = false;
        this.f16254a = motionLayout;
        this.f16269q = new d(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            b bVar = null;
            while (true) {
                byte b10 = 1;
                if (eventType != 1) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (!name.equals("ConstraintSet")) {
                                    b10 = -1;
                                } else {
                                    b10 = 5;
                                }
                                break;
                            case -1239391468:
                                if (!name.equals("KeyFrameSet")) {
                                    b10 = -1;
                                } else {
                                    b10 = 8;
                                }
                                break;
                            case -687739768:
                                if (!name.equals("Include")) {
                                    b10 = -1;
                                } else {
                                    b10 = 7;
                                }
                                break;
                            case 61998586:
                                if (!name.equals("ViewTransition")) {
                                    b10 = -1;
                                } else {
                                    b10 = 9;
                                }
                                break;
                            case 269306229:
                                if (!name.equals("Transition")) {
                                    b10 = -1;
                                }
                                break;
                            case 312750793:
                                if (!name.equals("OnClick")) {
                                    b10 = -1;
                                } else {
                                    b10 = 3;
                                }
                                break;
                            case 327855227:
                                if (!name.equals("OnSwipe")) {
                                    b10 = -1;
                                } else {
                                    b10 = 2;
                                }
                                break;
                            case 793277014:
                                if (!name.equals("MotionScene")) {
                                    b10 = -1;
                                } else {
                                    b10 = 0;
                                }
                                break;
                            case 1382829617:
                                if (!name.equals("StateSet")) {
                                    b10 = -1;
                                } else {
                                    b10 = 4;
                                }
                                break;
                            case 1942574248:
                                if (!name.equals("include")) {
                                    b10 = -1;
                                } else {
                                    b10 = 6;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        MotionLayout motionLayout2 = this.f16254a;
                        switch (b10) {
                            case 0:
                                k(context, xml);
                                break;
                            case 1:
                                bVar = new b(this, context, xml);
                                arrayList.add(bVar);
                                if (this.f16256c == null && !bVar.f16274b) {
                                    this.f16256c = bVar;
                                    androidx.constraintlayout.motion.widget.b bVar2 = bVar.f16283l;
                                    if (bVar2 != null) {
                                        bVar2.c(this.f16268p);
                                    }
                                }
                                if (bVar.f16274b) {
                                    if (bVar.f16275c == -1) {
                                        this.f16258e = bVar;
                                    } else {
                                        this.f16259f.add(bVar);
                                    }
                                    arrayList.remove(bVar);
                                }
                                break;
                            case 2:
                                if (bVar == null) {
                                    context.getResources().getResourceEntryName(i10);
                                    xml.getLineNumber();
                                }
                                if (bVar != null) {
                                    bVar.f16283l = new androidx.constraintlayout.motion.widget.b(context, motionLayout2, xml);
                                }
                                break;
                            case 3:
                                if (bVar != null && !motionLayout2.isInEditMode()) {
                                    bVar.f16284m.add(new b.ViewOnClickListenerC0167a(context, bVar, xml));
                                }
                                break;
                            case 4:
                                this.f16255b = new f(context, xml);
                                break;
                            case 5:
                                h(context, xml);
                                break;
                            case 6:
                            case 7:
                                j(context, xml);
                                break;
                            case 8:
                                g gVar = new g(context, xml);
                                if (bVar != null) {
                                    bVar.f16282k.add(gVar);
                                }
                                break;
                            case 9:
                                c cVar = new c(context, xml);
                                d dVar = this.f16269q;
                                dVar.f16357b.add(cVar);
                                dVar.f16358c = null;
                                int i11 = cVar.f16325b;
                                if (i11 == 4 || i11 == 5) {
                                    d.a(cVar);
                                }
                                break;
                        }
                    }
                    eventType = xml.next();
                }
                this.f16260g.put(R.id.motion_base, new androidx.constraintlayout.widget.b());
                this.f16261h.put("motion_base", Integer.valueOf(R.id.motion_base));
                return;
            }
        } catch (IOException e10) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e11);
        }
    }

    public static int c(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return identifier;
    }

    public final boolean a(int i10, MotionLayout motionLayout) {
        b bVar;
        if (this.f16267o != null) {
            return false;
        }
        for (b bVar2 : this.f16257d) {
            int i11 = bVar2.f16285n;
            if (i11 != 0 && ((bVar = this.f16256c) != bVar2 || (bVar.f16289r & 2) == 0)) {
                int i12 = bVar2.f16276d;
                MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.f16219e;
                MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.f16218d;
                MotionLayout.TransitionState transitionState3 = MotionLayout.TransitionState.f16217c;
                if (i10 == i12 && (i11 == 4 || i11 == 2)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f16285n == 4) {
                        motionLayout.r(1.0f);
                        motionLayout.f16175K0 = null;
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.t(true);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        motionLayout.setState(transitionState);
                        motionLayout.y();
                    }
                    return true;
                }
                if (i10 == bVar2.f16275c && (i11 == 3 || i11 == 1)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(bVar2);
                    if (bVar2.f16285n == 3) {
                        motionLayout.r(0.0f);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.t(true);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        motionLayout.setState(transitionState);
                        motionLayout.y();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final androidx.constraintlayout.widget.b b(int i10) {
        int iA;
        f fVar = this.f16255b;
        if (fVar != null && (iA = fVar.a(i10)) != -1) {
            i10 = iA;
        }
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.f16260g;
        if (sparseArray.get(i10) != null) {
            return sparseArray.get(i10);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + p126k0.a.c(this.f16254a.getContext(), i10) + " In MotionScene");
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public final Interpolator d() {
        b bVar = this.f16256c;
        int i10 = bVar.f16277e;
        if (i10 == -2) {
            return AnimationUtils.loadInterpolator(this.f16254a.getContext(), this.f16256c.f16279g);
        }
        if (i10 == -1) {
            return new InterpolatorC0166a(p077g0.c.c(bVar.f16278f));
        }
        if (i10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 == 2) {
            return new DecelerateInterpolator();
        }
        if (i10 == 4) {
            return new BounceInterpolator();
        }
        if (i10 == 5) {
            return new OvershootInterpolator();
        }
        if (i10 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void e(n nVar) {
        b bVar = this.f16256c;
        if (bVar != null) {
            Iterator<g> it = bVar.f16282k.iterator();
            while (it.hasNext()) {
                it.next().a(nVar);
            }
        } else {
            b bVar2 = this.f16258e;
            if (bVar2 != null) {
                Iterator<g> it2 = bVar2.f16282k.iterator();
                while (it2.hasNext()) {
                    it2.next().a(nVar);
                }
            }
        }
    }

    public final float f() {
        androidx.constraintlayout.motion.widget.b bVar;
        b bVar2 = this.f16256c;
        if (bVar2 == null || (bVar = bVar2.f16283l) == null) {
            return 0.0f;
        }
        return bVar.f16317t;
    }

    public final int g() {
        b bVar = this.f16256c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f16276d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    public final int h(Context context, XmlResourceParser xmlResourceParser) {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f16487f = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int iC = -1;
        int iC2 = -1;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName) {
                case "deriveConstraintsFrom":
                    iC2 = c(context, attributeValue);
                    break;
                case "constraintRotate":
                    try {
                        bVar.f16485d = Integer.parseInt(attributeValue);
                        break;
                    } catch (NumberFormatException unused) {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "x_left":
                                bVar.f16485d = 4;
                                break;
                            case "left":
                                bVar.f16485d = 2;
                                break;
                            case "none":
                                bVar.f16485d = 0;
                                break;
                            case "right":
                                bVar.f16485d = 1;
                                break;
                            case "x_right":
                                bVar.f16485d = 3;
                                break;
                        }
                    }
                    break;
                case "id":
                    iC = c(context, attributeValue);
                    int iIndexOf = attributeValue.indexOf(47);
                    if (iIndexOf >= 0) {
                        attributeValue = attributeValue.substring(iIndexOf + 1);
                    }
                    this.f16261h.put(attributeValue, Integer.valueOf(iC));
                    bVar.f16482a = p126k0.a.c(context, iC);
                    break;
                case "stateLabels":
                    bVar.f16484c = attributeValue.split(",");
                    int i11 = 0;
                    while (true) {
                        String[] strArr = bVar.f16484c;
                        if (i11 < strArr.length) {
                            strArr[i11] = strArr[i11].trim();
                            i11++;
                        }
                    }
                    break;
            }
        }
        if (iC != -1) {
            int i12 = this.f16254a.f16176L;
            bVar.k(context, xmlResourceParser);
            if (iC2 != -1) {
                this.f16262i.put(iC, iC2);
            }
            this.f16260g.put(iC, bVar);
        }
        return iC;
    }

    public final int i(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return h(context, xml);
                }
            }
            return -1;
        } catch (IOException e10) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e10);
            return -1;
        } catch (XmlPullParserException e11) {
            Log.e("MotionScene", "Error parsing resource: " + i10, e11);
            return -1;
        }
    }

    public final void j(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p139l0.d.f44146y);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                i(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p139l0.d.f44136o);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.j);
                this.j = i11;
                if (i11 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.f16263k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(int i10, MotionLayout motionLayout) {
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = this.f16260g;
        androidx.constraintlayout.widget.b bVar = sparseArray.get(i10);
        bVar.f16483b = bVar.f16482a;
        int i11 = this.f16262i.get(i10);
        HashMap<Integer, androidx.constraintlayout.widget.b.a> map = bVar.f16488g;
        if (i11 > 0) {
            l(i11, motionLayout);
            androidx.constraintlayout.widget.b bVar2 = sparseArray.get(i11);
            if (bVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + p126k0.a.c(this.f16254a.getContext(), i11));
                return;
            }
            bVar.f16483b += "/" + bVar2.f16483b;
            HashMap<Integer, androidx.constraintlayout.widget.b.a> map2 = bVar2.f16488g;
            for (Integer num : map2.keySet()) {
                num.getClass();
                androidx.constraintlayout.widget.b.a aVar = map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new androidx.constraintlayout.widget.b.a());
                }
                androidx.constraintlayout.widget.b.a aVar2 = map.get(num);
                if (aVar2 != null) {
                    androidx.constraintlayout.widget.b.C0170b c0170b = aVar2.f16493e;
                    if (!c0170b.f16537b) {
                        c0170b.a(aVar.f16493e);
                    }
                    androidx.constraintlayout.widget.b.d dVar = aVar2.f16491c;
                    if (!dVar.f16589a) {
                        androidx.constraintlayout.widget.b.d dVar2 = aVar.f16491c;
                        dVar.f16589a = dVar2.f16589a;
                        dVar.f16590b = dVar2.f16590b;
                        dVar.f16592d = dVar2.f16592d;
                        dVar.f16593e = dVar2.f16593e;
                        dVar.f16591c = dVar2.f16591c;
                    }
                    androidx.constraintlayout.widget.b.e eVar = aVar2.f16494f;
                    if (!eVar.f16595a) {
                        eVar.a(aVar.f16494f);
                    }
                    androidx.constraintlayout.widget.b.c cVar = aVar2.f16492d;
                    if (!cVar.f16577a) {
                        cVar.a(aVar.f16492d);
                    }
                    for (String str : aVar.f16495g.keySet()) {
                        if (!aVar2.f16495g.containsKey(str)) {
                            aVar2.f16495g.put(str, aVar.f16495g.get(str));
                        }
                    }
                }
            }
        } else {
            bVar.f16483b = Q8.d.a(new StringBuilder(), bVar.f16483b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = motionLayout.getChildAt(i12);
                ConstraintLayout.a aVar3 = (ConstraintLayout.a) childAt.getLayoutParams();
                int id = childAt.getId();
                if (bVar.f16487f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new androidx.constraintlayout.widget.b.a());
                }
                androidx.constraintlayout.widget.b.a aVar4 = map.get(Integer.valueOf(id));
                if (aVar4 != null) {
                    androidx.constraintlayout.widget.b.C0170b c0170b2 = aVar4.f16493e;
                    if (!c0170b2.f16537b) {
                        aVar4.c(id, aVar3);
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            c0170b2.f16553j0 = ((androidx.constraintlayout.widget.a) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                c0170b2.f16563o0 = barrier.getAllowsGoneWidget();
                                c0170b2.f16548g0 = barrier.getType();
                                c0170b2.f16550h0 = barrier.getMargin();
                            }
                        }
                        c0170b2.f16537b = true;
                    }
                    androidx.constraintlayout.widget.b.d dVar3 = aVar4.f16491c;
                    if (!dVar3.f16589a) {
                        dVar3.f16590b = childAt.getVisibility();
                        dVar3.f16592d = childAt.getAlpha();
                        dVar3.f16589a = true;
                    }
                    androidx.constraintlayout.widget.b.e eVar2 = aVar4.f16494f;
                    if (!eVar2.f16595a) {
                        eVar2.f16595a = true;
                        eVar2.f16596b = childAt.getRotation();
                        eVar2.f16597c = childAt.getRotationX();
                        eVar2.f16598d = childAt.getRotationY();
                        eVar2.f16599e = childAt.getScaleX();
                        eVar2.f16600f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            eVar2.f16601g = pivotX;
                            eVar2.f16602h = pivotY;
                        }
                        eVar2.j = childAt.getTranslationX();
                        eVar2.f16604k = childAt.getTranslationY();
                        eVar2.f16605l = childAt.getTranslationZ();
                        if (eVar2.f16606m) {
                            eVar2.f16607n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        for (androidx.constraintlayout.widget.b.a aVar5 : map.values()) {
            if (aVar5.f16496h != null) {
                if (aVar5.f16490b == null) {
                    aVar5.f16496h.e(bVar.i(aVar5.f16489a));
                } else {
                    Iterator<Integer> it = map.keySet().iterator();
                    while (it.hasNext()) {
                        androidx.constraintlayout.widget.b.a aVarI = bVar.i(it.next().intValue());
                        String str2 = aVarI.f16493e.f16557l0;
                        if (str2 != null && aVar5.f16490b.matches(str2)) {
                            aVar5.f16496h.e(aVarI);
                            aVarI.f16495g.putAll((HashMap) aVar5.f16495g.clone());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0033  */
    /* JADX WARN: Code duplicated, block: B:32:0x004d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public final void m(int i10, int i11) {
        int iA;
        int iA2;
        b bVar;
        ArrayList<b> arrayList;
        Iterator<b> it;
        b bVar2;
        b bVar3;
        b next;
        int i12;
        androidx.constraintlayout.motion.widget.b bVar4;
        f fVar = this.f16255b;
        if (fVar != null) {
            iA = fVar.a(i10);
            if (iA == -1) {
                iA = i10;
            }
            iA2 = this.f16255b.a(i11);
            if (iA2 == -1) {
            }
            bVar = this.f16256c;
            if (bVar == null && bVar.f16275c == i11 && bVar.f16276d == i10) {
                return;
            }
            arrayList = this.f16257d;
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    bVar2 = this.f16258e;
                    for (b bVar5 : this.f16259f) {
                        if (bVar5.f16275c == i11) {
                            bVar2 = bVar5;
                        }
                    }
                    bVar3 = new b(this, bVar2);
                    bVar3.f16276d = iA;
                    bVar3.f16275c = iA2;
                    if (iA != -1) {
                        arrayList.add(bVar3);
                    }
                    this.f16256c = bVar3;
                    return;
                }
                next = it.next();
                i12 = next.f16275c;
                if ((i12 != iA2 && next.f16276d == iA) || (i12 == i11 && next.f16276d == i10)) {
                    break;
                }
            }
            this.f16256c = next;
            bVar4 = next.f16283l;
            if (bVar4 != null) {
                bVar4.c(this.f16268p);
            }
        }
        iA = i10;
        iA2 = i11;
        bVar = this.f16256c;
        if (bVar == null) {
        }
        arrayList = this.f16257d;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                bVar2 = this.f16258e;
                while (r4.hasNext()) {
                    if (bVar5.f16275c == i11) {
                        bVar2 = bVar5;
                    }
                }
                bVar3 = new b(this, bVar2);
                bVar3.f16276d = iA;
                bVar3.f16275c = iA2;
                if (iA != -1) {
                    arrayList.add(bVar3);
                }
                this.f16256c = bVar3;
                return;
            }
            next = it.next();
            i12 = next.f16275c;
            if (i12 != iA2) {
            }
        }
        this.f16256c = next;
        bVar4 = next.f16283l;
        if (bVar4 != null) {
            bVar4.c(this.f16268p);
        }
    }

    public final boolean n() {
        Iterator<b> it = this.f16257d.iterator();
        while (it.hasNext()) {
            if (it.next().f16283l != null) {
                return true;
            }
        }
        b bVar = this.f16256c;
        return (bVar == null || bVar.f16283l == null) ? false : true;
    }

    /* JADX INFO: compiled from: MotionScene.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f16273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f16274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16275c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f16278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16279g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f16280h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f16281i;
        public final a j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList<g> f16282k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public androidx.constraintlayout.motion.widget.b f16283l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final ArrayList<ViewOnClickListenerC0167a> f16284m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f16285n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f16286o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f16287p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f16288q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f16289r;

        /* JADX INFO: renamed from: androidx.constraintlayout.motion.widget.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MotionScene.java */
        public static class ViewOnClickListenerC0167a implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f16290b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f16291c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f16292d;

            public ViewOnClickListenerC0167a(Context context, b bVar, XmlResourceParser xmlResourceParser) {
                this.f16291c = -1;
                this.f16292d = 17;
                this.f16290b = bVar;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p139l0.d.f44137p);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    if (index == 1) {
                        this.f16291c = typedArrayObtainStyledAttributes.getResourceId(index, this.f16291c);
                    } else if (index == 0) {
                        this.f16292d = typedArrayObtainStyledAttributes.getInt(index, this.f16292d);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public final void a(MotionLayout motionLayout, int i10, b bVar) {
                boolean z10;
                View viewFindViewById;
                int i11 = this.f16291c;
                View view = motionLayout;
                if (i11 != -1) {
                    viewFindViewById = motionLayout.findViewById(i11);
                }
                if (view == null) {
                    view = viewFindViewById;
                    Log.e("MotionScene", "OnClick could not find id " + i11);
                    return;
                }
                int i12 = bVar.f16276d;
                int i13 = bVar.f16275c;
                if (i12 == -1) {
                    view = viewFindViewById;
                    view.setOnClickListener(this);
                    return;
                }
                int i14 = this.f16292d;
                int i15 = i14 & 1;
                if (i15 == 0 || i10 != i12) {
                    view = viewFindViewById;
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (((i15 != 0 && i10 == i12) | z10 | ((i14 & 256) != 0 && i10 == i12) | ((i14 & 16) != 0 && i10 == i13)) || ((i14 & 4096) != 0 && i10 == i13)) {
                    view.setOnClickListener(this);
                }
            }

            public final void b(MotionLayout motionLayout) {
                int i10 = this.f16291c;
                if (i10 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i10);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i10);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = this.f16290b;
                a aVar = bVar.j;
                MotionLayout motionLayout = aVar.f16254a;
                if (motionLayout.f16154A) {
                    if (bVar.f16276d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState == -1) {
                            motionLayout.E(bVar.f16275c);
                            return;
                        }
                        b bVar2 = new b(aVar, bVar);
                        bVar2.f16276d = currentState;
                        bVar2.f16275c = bVar.f16275c;
                        motionLayout.setTransition(bVar2);
                        motionLayout.r(1.0f);
                        motionLayout.f16175K0 = null;
                        return;
                    }
                    b bVar3 = aVar.f16256c;
                    int i10 = this.f16292d;
                    int i11 = i10 & 1;
                    boolean z10 = true;
                    boolean z11 = false;
                    boolean z12 = (i11 == 0 && (i10 & 256) == 0) ? false : true;
                    int i12 = i10 & 16;
                    if (i12 == 0 && (i10 & 4096) == 0) {
                        z10 = false;
                    }
                    if (z12 && z10) {
                        if (bVar3 != bVar) {
                            motionLayout.setTransition(bVar);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z10 = false;
                            z11 = z12;
                        }
                    } else {
                        z11 = z12;
                    }
                    if (bVar != bVar3) {
                        int i13 = bVar.f16275c;
                        int i14 = bVar.f16276d;
                        if (i14 != -1) {
                            int i15 = motionLayout.f16208w;
                            if (i15 != i14 && i15 != i13) {
                                return;
                            }
                        } else if (motionLayout.f16208w == i13) {
                            return;
                        }
                    }
                    if (z11 && i11 != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.r(1.0f);
                        motionLayout.f16175K0 = null;
                        return;
                    }
                    if (z10 && i12 != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.r(0.0f);
                    } else if (z11 && (i10 & 256) != 0) {
                        motionLayout.setTransition(bVar);
                        motionLayout.setProgress(1.0f);
                    } else {
                        if (!z10 || (i10 & 4096) == 0) {
                            return;
                        }
                        motionLayout.setTransition(bVar);
                        motionLayout.setProgress(0.0f);
                    }
                }
            }
        }

        public b(a aVar, b bVar) {
            this.f16273a = -1;
            this.f16274b = false;
            this.f16275c = -1;
            this.f16276d = -1;
            this.f16277e = 0;
            this.f16278f = null;
            this.f16279g = -1;
            this.f16280h = CarouselScreenFragment.CAROUSEL_ANIMATION_MS;
            this.f16281i = 0.0f;
            this.f16282k = new ArrayList<>();
            this.f16283l = null;
            this.f16284m = new ArrayList<>();
            this.f16285n = 0;
            this.f16286o = false;
            this.f16287p = -1;
            this.f16288q = 0;
            this.f16289r = 0;
            this.j = aVar;
            this.f16280h = aVar.j;
            if (bVar != null) {
                this.f16287p = bVar.f16287p;
                this.f16277e = bVar.f16277e;
                this.f16278f = bVar.f16278f;
                this.f16279g = bVar.f16279g;
                this.f16280h = bVar.f16280h;
                this.f16282k = bVar.f16282k;
                this.f16281i = bVar.f16281i;
                this.f16288q = bVar.f16288q;
            }
        }

        public b(a aVar, int i10) {
            this.f16273a = -1;
            this.f16274b = false;
            this.f16275c = -1;
            this.f16276d = -1;
            this.f16277e = 0;
            this.f16278f = null;
            this.f16279g = -1;
            this.f16280h = CarouselScreenFragment.CAROUSEL_ANIMATION_MS;
            this.f16281i = 0.0f;
            this.f16282k = new ArrayList<>();
            this.f16283l = null;
            this.f16284m = new ArrayList<>();
            this.f16285n = 0;
            this.f16286o = false;
            this.f16287p = -1;
            this.f16288q = 0;
            this.f16289r = 0;
            this.f16273a = -1;
            this.j = aVar;
            this.f16276d = R.id.view_transition;
            this.f16275c = i10;
            this.f16280h = aVar.j;
            this.f16288q = aVar.f16263k;
        }

        public b(a aVar, Context context, XmlResourceParser xmlResourceParser) {
            this.f16273a = -1;
            this.f16274b = false;
            this.f16275c = -1;
            this.f16276d = -1;
            this.f16277e = 0;
            this.f16278f = null;
            this.f16279g = -1;
            this.f16280h = CarouselScreenFragment.CAROUSEL_ANIMATION_MS;
            this.f16281i = 0.0f;
            this.f16282k = new ArrayList<>();
            this.f16283l = null;
            this.f16284m = new ArrayList<>();
            this.f16285n = 0;
            this.f16286o = false;
            this.f16287p = -1;
            this.f16288q = 0;
            this.f16289r = 0;
            this.f16280h = aVar.j;
            this.f16288q = aVar.f16263k;
            this.j = aVar;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p139l0.d.f44143v);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                SparseArray<androidx.constraintlayout.widget.b> sparseArray = aVar.f16260g;
                if (index == 2) {
                    this.f16275c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f16275c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        bVar.j(context, this.f16275c);
                        sparseArray.append(this.f16275c, bVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f16275c = aVar.i(context, this.f16275c);
                    }
                } else if (index == 3) {
                    this.f16276d = typedArrayObtainStyledAttributes.getResourceId(index, this.f16276d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f16276d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        bVar2.j(context, this.f16276d);
                        sparseArray.append(this.f16276d, bVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f16276d = aVar.i(context, this.f16276d);
                    }
                } else if (index == 6) {
                    int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i11 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.f16279g = resourceId;
                        if (resourceId != -1) {
                            this.f16277e = -2;
                        }
                    } else if (i11 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f16278f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f16279g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f16277e = -2;
                            } else {
                                this.f16277e = -1;
                            }
                        }
                    } else {
                        this.f16277e = typedArrayObtainStyledAttributes.getInteger(index, this.f16277e);
                    }
                } else if (index == 4) {
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, this.f16280h);
                    this.f16280h = i12;
                    if (i12 < 8) {
                        this.f16280h = 8;
                    }
                } else if (index == 8) {
                    this.f16281i = typedArrayObtainStyledAttributes.getFloat(index, this.f16281i);
                } else if (index == 1) {
                    this.f16285n = typedArrayObtainStyledAttributes.getInteger(index, this.f16285n);
                } else if (index == 0) {
                    this.f16273a = typedArrayObtainStyledAttributes.getResourceId(index, this.f16273a);
                } else if (index == 9) {
                    this.f16286o = typedArrayObtainStyledAttributes.getBoolean(index, this.f16286o);
                } else if (index == 7) {
                    this.f16287p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f16288q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f16289r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.f16276d == -1) {
                this.f16274b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
