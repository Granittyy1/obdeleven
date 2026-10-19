package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class DependencyNode implements p101i0.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WidgetRun f16025d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16028g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WidgetRun f16022a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16023b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16024c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Type f16026e = Type.f16033b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16029h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f16030i = null;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f16031k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f16032l = new ArrayList();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Type {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Type f16033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Type f16034c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Type f16035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Type f16036e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Type f16037f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Type f16038g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Type f16039h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final Type f16040i;
        public static final /* synthetic */ Type[] j;

        static {
            Type type = new Type("UNKNOWN", 0);
            f16033b = type;
            Type type2 = new Type("HORIZONTAL_DIMENSION", 1);
            f16034c = type2;
            Type type3 = new Type("VERTICAL_DIMENSION", 2);
            f16035d = type3;
            Type type4 = new Type("LEFT", 3);
            f16036e = type4;
            Type type5 = new Type("RIGHT", 4);
            f16037f = type5;
            Type type6 = new Type("TOP", 5);
            f16038g = type6;
            Type type7 = new Type("BOTTOM", 6);
            f16039h = type7;
            Type type8 = new Type("BASELINE", 7);
            f16040i = type8;
            j = new Type[]{type, type2, type3, type4, type5, type6, type7, type8};
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) j.clone();
        }
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f16025d = widgetRun;
    }

    @Override // p101i0.d
    public final void a(p101i0.d dVar) {
        ArrayList<DependencyNode> arrayList = this.f16032l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((DependencyNode) it.next()).j) {
                return;
            }
        }
        this.f16024c = true;
        WidgetRun widgetRun = this.f16022a;
        if (widgetRun != null) {
            widgetRun.a(this);
        }
        if (this.f16023b) {
            this.f16025d.a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i10 = 0;
        for (DependencyNode dependencyNode2 : arrayList) {
            if (!(dependencyNode2 instanceof a)) {
                i10++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i10 == 1 && dependencyNode.j) {
            a aVar = this.f16030i;
            if (aVar != null) {
                if (!aVar.j) {
                    return;
                } else {
                    this.f16027f = this.f16029h * aVar.f16028g;
                }
            }
            d(dependencyNode.f16028g + this.f16027f);
        }
        WidgetRun widgetRun2 = this.f16022a;
        if (widgetRun2 != null) {
            widgetRun2.a(this);
        }
    }

    public final void b(WidgetRun widgetRun) {
        this.f16031k.add(widgetRun);
        if (this.j) {
            widgetRun.a(widgetRun);
        }
    }

    public final void c() {
        this.f16032l.clear();
        this.f16031k.clear();
        this.j = false;
        this.f16028g = 0;
        this.f16024c = false;
        this.f16023b = false;
    }

    public void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f16028g = i10;
        for (p101i0.d dVar : this.f16031k) {
            dVar.a(dVar);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16025d.f16042b.f15988k0);
        sb2.append(":");
        sb2.append(this.f16026e);
        sb2.append("(");
        sb2.append(this.j ? Integer.valueOf(this.f16028g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f16032l.size());
        sb2.append(":d=");
        sb2.append(this.f16031k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
