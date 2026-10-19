package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.i;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import me.zhanghai.android.materialprogressbar.R;
import p101i0.h;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static p139l0.e f16380q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<View> f16381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<androidx.constraintlayout.widget.a> f16382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.d f16383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16388i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.constraintlayout.widget.b f16389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p139l0.a f16390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public HashMap<String, Integer> f16392n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SparseArray<ConstraintWidget> f16393o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f16394p;

    public class b implements p101i0.b.InterfaceC0381b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConstraintLayout f16464a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16465b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16466c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16470g;

        public b(ConstraintLayout constraintLayout) {
            this.f16464a = constraintLayout;
        }

        public static boolean a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            return View.MeasureSpec.getMode(i11) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i12 == View.MeasureSpec.getSize(i11);
        }

        /* JADX WARN: Code duplicated, block: B:119:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:120:0x01aa  */
        /* JADX WARN: Code duplicated, block: B:122:0x01ad  */
        /* JADX WARN: Code duplicated, block: B:123:0x01af  */
        /* JADX WARN: Code duplicated, block: B:129:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:134:0x01c3  */
        /* JADX WARN: Code duplicated, block: B:140:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:145:0x01da  */
        /* JADX WARN: Code duplicated, block: B:147:0x01dd A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:148:0x01de  */
        /* JADX WARN: Code duplicated, block: B:160:0x0200  */
        /* JADX WARN: Code duplicated, block: B:162:0x0204  */
        /* JADX WARN: Code duplicated, block: B:165:0x0212  */
        /* JADX WARN: Code duplicated, block: B:168:0x022c  */
        /* JADX WARN: Code duplicated, block: B:169:0x0231  */
        /* JADX WARN: Code duplicated, block: B:172:0x0236  */
        /* JADX WARN: Code duplicated, block: B:175:0x023e  */
        /* JADX WARN: Code duplicated, block: B:176:0x0245  */
        /* JADX WARN: Code duplicated, block: B:179:0x024c  */
        /* JADX WARN: Code duplicated, block: B:182:0x0259  */
        /* JADX WARN: Code duplicated, block: B:184:0x025d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:186:0x0267 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:187:0x0269 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:190:0x0273 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:193:0x027a  */
        /* JADX WARN: Code duplicated, block: B:195:0x027e  */
        /* JADX WARN: Code duplicated, block: B:197:0x0284  */
        /* JADX WARN: Code duplicated, block: B:198:0x0289  */
        /* JADX WARN: Code duplicated, block: B:201:0x02a6  */
        /* JADX WARN: Code duplicated, block: B:202:0x02a8  */
        /* JADX WARN: Code duplicated, block: B:209:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:212:0x02bb  */
        /* JADX WARN: Code duplicated, block: B:213:0x02bd  */
        /* JADX WARN: Code duplicated, block: B:55:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
        /* JADX WARN: Code duplicated, block: B:59:0x00c3  */
        /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:64:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:67:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:69:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:71:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:72:0x00ef  */
        /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
        /* JADX WARN: Code duplicated, block: B:78:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:81:0x0103  */
        /* JADX WARN: Code duplicated, block: B:82:0x0105  */
        /* JADX WARN: Code duplicated, block: B:92:0x011a  */
        /* JADX WARN: Code duplicated, block: B:93:0x0125  */
        /* JADX WARN: Code duplicated, block: B:94:0x012f  */
        public final void b(ConstraintWidget constraintWidget, i0.b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iOrdinal;
            int iMakeMeasureSpec3;
            androidx.constraintlayout.core.widgets.d dVar;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour;
            boolean z10;
            boolean z11;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            a aVar2;
            int i10;
            int measuredWidth;
            int measuredHeight;
            int i11;
            int iMin;
            int i12;
            int i13;
            int measuredHeight2;
            int i14;
            int iMakeMeasureSpec4;
            boolean z16;
            int baseline;
            int i15;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            int i16;
            int i17;
            boolean z21;
            int i18;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.f15985i0 == 8 && !constraintWidget.f15947F) {
                aVar.f36468e = 0;
                aVar.f36469f = 0;
                aVar.f36470g = 0;
                return;
            }
            if (constraintWidget.f15963V == null) {
                return;
            }
            p139l0.e eVar = ConstraintLayout.f16380q;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            constraintLayout.getClass();
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f36464a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = aVar.f36465b;
            int i19 = aVar.f36466c;
            int i20 = aVar.f36467d;
            int i21 = this.f16465b + this.f16466c;
            int i22 = this.f16467d;
            View view = constraintWidget.f15983h0;
            int iOrdinal2 = dimensionBehaviour3.ordinal();
            ConstraintAnchor constraintAnchor = constraintWidget.f15953L;
            ConstraintAnchor constraintAnchor2 = constraintWidget.f15951J;
            if (iOrdinal2 == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
            } else {
                if (iOrdinal2 != 1) {
                    if (iOrdinal2 == 2) {
                        iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f16469f, i22, -2);
                        boolean z22 = constraintWidget.f16001r == 1;
                        int i23 = aVar.j;
                        if (i23 == 1 || i23 == 2) {
                            boolean z23 = view.getMeasuredHeight() == constraintWidget.o();
                            if (aVar.j == 2 || !z22 || ((z22 && z23) || (view instanceof e) || constraintWidget.E())) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.u(), 1073741824);
                            }
                        }
                    } else if (iOrdinal2 != 3) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        int i24 = this.f16469f;
                        int i25 = constraintAnchor2 != null ? constraintAnchor2.f15931g : 0;
                        if (constraintAnchor != null) {
                            i25 += constraintAnchor.f15931g;
                        }
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i24, i22 + i25, -1);
                    }
                    iOrdinal = dimensionBehaviour4.ordinal();
                    if (iOrdinal != 0) {
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                    } else if (iOrdinal != 1) {
                        iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f16470g, i21, -2);
                    } else if (iOrdinal != 2) {
                        iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f16470g, i21, -2);
                        if (constraintWidget.f16003s == 1) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        i16 = aVar.j;
                        if (i16 != 1) {
                            i17 = 2;
                            if (i16 == 2) {
                            }
                        } else {
                            i17 = 2;
                        }
                        if (view.getMeasuredWidth() == constraintWidget.u()) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (aVar.j != i17 || !z20 || ((z20 && z21) || (view instanceof e) || constraintWidget.F())) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(constraintWidget.o(), 1073741824);
                        }
                    } else if (iOrdinal != 3) {
                        iMakeMeasureSpec3 = 0;
                    } else {
                        int i26 = this.f16470g;
                        if (constraintAnchor2 != null) {
                            i18 = constraintWidget.f15952K.f15931g;
                        } else {
                            i18 = 0;
                        }
                        if (constraintAnchor != null) {
                            i18 += constraintWidget.f15954M.f15931g;
                        }
                        iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i26, i21 + i18, -1);
                    }
                    dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.f15963V;
                    if (dVar == null && g.b(constraintLayout.j, 256) && view.getMeasuredWidth() == constraintWidget.u() && view.getMeasuredWidth() < dVar.u() && view.getMeasuredHeight() == constraintWidget.o() && view.getMeasuredHeight() < dVar.o() && view.getBaseline() == constraintWidget.f15973c0 && !constraintWidget.D() && a(constraintWidget.f15949H, iMakeMeasureSpec2, constraintWidget.u()) && a(constraintWidget.f15950I, iMakeMeasureSpec3, constraintWidget.o())) {
                        aVar.f36468e = constraintWidget.u();
                        aVar.f36469f = constraintWidget.o();
                        aVar.f36470g = constraintWidget.f15973c0;
                        return;
                    }
                    dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16015d;
                    if (dimensionBehaviour3 == dimensionBehaviour) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f16016e;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.f16013b;
                    if (dimensionBehaviour4 != dimensionBehaviour2 || dimensionBehaviour4 == dimensionBehaviour5) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (dimensionBehaviour3 != dimensionBehaviour2 || dimensionBehaviour3 == dimensionBehaviour5) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z10 || constraintWidget.f15966Y <= 0.0f) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    if (z11 || constraintWidget.f15966Y <= 0.0f) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (view == null) {
                        return;
                    }
                    aVar2 = (a) view.getLayoutParams();
                    i10 = aVar.j;
                    if (i10 == 1 && i10 != 2 && z10 && constraintWidget.f16001r == 0 && z11 && constraintWidget.f16003s == 0) {
                        measuredHeight2 = 0;
                        i15 = -1;
                        baseline = 0;
                        z16 = false;
                        iMin = 0;
                    } else {
                        if ((view instanceof p139l0.g) || !(constraintWidget instanceof i)) {
                            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                        } else {
                            ((p139l0.g) view).l((i) constraintWidget, iMakeMeasureSpec2, iMakeMeasureSpec3);
                        }
                        constraintWidget.f15949H = iMakeMeasureSpec2;
                        constraintWidget.f15950I = iMakeMeasureSpec3;
                        constraintWidget.f15980g = false;
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        int baseline2 = view.getBaseline();
                        i11 = constraintWidget.f16007u;
                        if (i11 > 0) {
                            iMin = Math.max(i11, measuredWidth);
                        } else {
                            iMin = measuredWidth;
                        }
                        i12 = constraintWidget.f16008v;
                        if (i12 > 0) {
                            iMin = Math.min(i12, iMin);
                        }
                        i13 = constraintWidget.f16010x;
                        if (i13 > 0) {
                            measuredHeight2 = Math.max(i13, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i14 = constraintWidget.f16011y;
                        if (i14 > 0) {
                            measuredHeight2 = Math.min(i14, measuredHeight2);
                        }
                        if (!g.b(constraintLayout.j, 1)) {
                            if (!z14 && z12) {
                                iMin = (int) ((measuredHeight2 * constraintWidget.f15966Y) + 0.5f);
                            } else if (z15 && z13) {
                                measuredHeight2 = (int) ((iMin / constraintWidget.f15966Y) + 0.5f);
                            }
                        }
                        if (measuredWidth == iMin || measuredHeight != measuredHeight2) {
                            if (measuredWidth != iMin) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            } else {
                                iMakeMeasureSpec4 = iMakeMeasureSpec3;
                            }
                            view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                            constraintWidget.f15949H = iMakeMeasureSpec2;
                            constraintWidget.f15950I = iMakeMeasureSpec4;
                            z16 = false;
                            constraintWidget.f15980g = false;
                            int measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            iMin = measuredWidth2;
                            baseline = view.getBaseline();
                            i15 = -1;
                        } else {
                            baseline = baseline2;
                            i15 = -1;
                            z16 = false;
                        }
                    }
                    if (baseline != i15) {
                        z17 = true;
                    } else {
                        z17 = z16;
                    }
                    if (iMin == aVar.f36466c || measuredHeight2 != aVar.f36467d) {
                        z18 = true;
                    } else {
                        z18 = z16;
                    }
                    aVar.f36472i = z18;
                    if (aVar2.f16426c0) {
                        z19 = true;
                    } else {
                        z19 = z17;
                    }
                    if (z19 && baseline != -1 && constraintWidget.f15973c0 != baseline) {
                        aVar.f36472i = true;
                    }
                    aVar.f36468e = iMin;
                    aVar.f36469f = measuredHeight2;
                    aVar.f36471h = z19;
                    aVar.f36470g = baseline;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f16469f, i22, -2);
            }
            iMakeMeasureSpec2 = iMakeMeasureSpec;
            iOrdinal = dimensionBehaviour4.ordinal();
            if (iOrdinal != 0) {
                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
            } else if (iOrdinal != 1) {
                iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f16470g, i21, -2);
            } else if (iOrdinal != 2) {
                iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f16470g, i21, -2);
                if (constraintWidget.f16003s == 1) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                i16 = aVar.j;
                if (i16 != 1) {
                    i17 = 2;
                    if (i16 == 2) {
                    }
                } else {
                    i17 = 2;
                }
                if (view.getMeasuredWidth() == constraintWidget.u()) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (aVar.j != i17) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(constraintWidget.o(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(constraintWidget.o(), 1073741824);
                }
            } else if (iOrdinal != 3) {
                iMakeMeasureSpec3 = 0;
            } else {
                int i27 = this.f16470g;
                if (constraintAnchor2 != null) {
                    i18 = constraintWidget.f15952K.f15931g;
                } else {
                    i18 = 0;
                }
                if (constraintAnchor != null) {
                    i18 += constraintWidget.f15954M.f15931g;
                }
                iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i27, i21 + i18, -1);
            }
            dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget.f15963V;
            if (dVar == null) {
            }
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16015d;
            if (dimensionBehaviour3 == dimensionBehaviour) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (dimensionBehaviour4 == dimensionBehaviour) {
                z11 = true;
            } else {
                z11 = false;
            }
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f16016e;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.f16013b;
            if (dimensionBehaviour4 != dimensionBehaviour2) {
                z12 = true;
            } else {
                z12 = true;
            }
            if (dimensionBehaviour3 != dimensionBehaviour2) {
                z13 = true;
            } else {
                z13 = true;
            }
            if (z10) {
                z14 = false;
            } else {
                z14 = false;
            }
            if (z11) {
                z15 = false;
            } else {
                z15 = false;
            }
            if (view == null) {
                return;
            }
            aVar2 = (a) view.getLayoutParams();
            i10 = aVar.j;
            if (i10 == 1) {
                if (view instanceof p139l0.g) {
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                } else {
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                }
                constraintWidget.f15949H = iMakeMeasureSpec2;
                constraintWidget.f15950I = iMakeMeasureSpec3;
                constraintWidget.f15980g = false;
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline3 = view.getBaseline();
                i11 = constraintWidget.f16007u;
                if (i11 > 0) {
                    iMin = Math.max(i11, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i12 = constraintWidget.f16008v;
                if (i12 > 0) {
                    iMin = Math.min(i12, iMin);
                }
                i13 = constraintWidget.f16010x;
                if (i13 > 0) {
                    measuredHeight2 = Math.max(i13, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i14 = constraintWidget.f16011y;
                if (i14 > 0) {
                    measuredHeight2 = Math.min(i14, measuredHeight2);
                }
                if (!g.b(constraintLayout.j, 1)) {
                    if (!z14) {
                        if (z15) {
                            measuredHeight2 = (int) ((iMin / constraintWidget.f15966Y) + 0.5f);
                        }
                    } else if (z15) {
                        measuredHeight2 = (int) ((iMin / constraintWidget.f15966Y) + 0.5f);
                    }
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = iMakeMeasureSpec3;
                    }
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                    constraintWidget.f15949H = iMakeMeasureSpec2;
                    constraintWidget.f15950I = iMakeMeasureSpec4;
                    z16 = false;
                    constraintWidget.f15980g = false;
                    int measuredWidth3 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    iMin = measuredWidth3;
                    baseline = view.getBaseline();
                    i15 = -1;
                } else {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = iMakeMeasureSpec3;
                    }
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                    constraintWidget.f15949H = iMakeMeasureSpec2;
                    constraintWidget.f15950I = iMakeMeasureSpec4;
                    z16 = false;
                    constraintWidget.f15980g = false;
                    int measuredWidth4 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    iMin = measuredWidth4;
                    baseline = view.getBaseline();
                    i15 = -1;
                }
            } else {
                if (view instanceof p139l0.g) {
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                } else {
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                }
                constraintWidget.f15949H = iMakeMeasureSpec2;
                constraintWidget.f15950I = iMakeMeasureSpec3;
                constraintWidget.f15980g = false;
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline4 = view.getBaseline();
                i11 = constraintWidget.f16007u;
                if (i11 > 0) {
                    iMin = Math.max(i11, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i12 = constraintWidget.f16008v;
                if (i12 > 0) {
                    iMin = Math.min(i12, iMin);
                }
                i13 = constraintWidget.f16010x;
                if (i13 > 0) {
                    measuredHeight2 = Math.max(i13, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i14 = constraintWidget.f16011y;
                if (i14 > 0) {
                    measuredHeight2 = Math.min(i14, measuredHeight2);
                }
                if (!g.b(constraintLayout.j, 1)) {
                    if (!z14) {
                        if (z15) {
                            measuredHeight2 = (int) ((iMin / constraintWidget.f15966Y) + 0.5f);
                        }
                    } else if (z15) {
                        measuredHeight2 = (int) ((iMin / constraintWidget.f15966Y) + 0.5f);
                    }
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = iMakeMeasureSpec3;
                    }
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                    constraintWidget.f15949H = iMakeMeasureSpec2;
                    constraintWidget.f15950I = iMakeMeasureSpec4;
                    z16 = false;
                    constraintWidget.f15980g = false;
                    int measuredWidth5 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    iMin = measuredWidth5;
                    baseline = view.getBaseline();
                    i15 = -1;
                } else {
                    if (measuredWidth != iMin) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    } else {
                        iMakeMeasureSpec4 = iMakeMeasureSpec3;
                    }
                    view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                    constraintWidget.f15949H = iMakeMeasureSpec2;
                    constraintWidget.f15950I = iMakeMeasureSpec4;
                    z16 = false;
                    constraintWidget.f15980g = false;
                    int measuredWidth6 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    iMin = measuredWidth6;
                    baseline = view.getBaseline();
                    i15 = -1;
                }
            }
            if (baseline != i15) {
                z17 = true;
            } else {
                z17 = z16;
            }
            if (iMin == aVar.f36466c) {
                z18 = true;
            } else {
                z18 = true;
            }
            aVar.f36472i = z18;
            if (aVar2.f16426c0) {
                z19 = true;
            } else {
                z19 = z17;
            }
            if (z19) {
                aVar.f36472i = true;
            }
            aVar.f36468e = iMin;
            aVar.f36469f = measuredHeight2;
            aVar.f36471h = z19;
            aVar.f36470g = baseline;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16381b = new SparseArray<>();
        this.f16382c = new ArrayList<>(4);
        this.f16383d = new androidx.constraintlayout.core.widgets.d();
        this.f16384e = 0;
        this.f16385f = 0;
        this.f16386g = BrazeLogger.SUPPRESS;
        this.f16387h = BrazeLogger.SUPPRESS;
        this.f16388i = true;
        this.j = 257;
        this.f16389k = null;
        this.f16390l = null;
        this.f16391m = -1;
        this.f16392n = new HashMap<>();
        this.f16393o = new SparseArray<>();
        this.f16394p = new b(this);
        e(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static p139l0.e getSharedValues() {
        if (f16380q == null) {
            p139l0.e eVar = new p139l0.e();
            new SparseIntArray();
            eVar.f44147a = new HashMap<>();
            f16380q = eVar;
        }
        return f16380q;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x02ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x02ea -> B:157:0x02eb). Please report as a decompilation issue!!! */
    public final void b(boolean z10, View view, ConstraintWidget constraintWidget, a aVar, SparseArray<ConstraintWidget> sparseArray) {
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        float f10;
        int i10;
        int i11;
        float fAbs;
        int i12;
        aVar.a();
        constraintWidget.f15985i0 = view.getVisibility();
        if (aVar.f16432f0) {
            constraintWidget.f15947F = true;
            constraintWidget.f15985i0 = 8;
        }
        constraintWidget.f15983h0 = view;
        if (view instanceof androidx.constraintlayout.widget.a) {
            ((androidx.constraintlayout.widget.a) view).j(constraintWidget, this.f16383d.f16092z0);
        }
        int i13 = -1;
        if (aVar.f16428d0) {
            f fVar = (f) constraintWidget;
            int i14 = aVar.f16447n0;
            int i15 = aVar.f16449o0;
            float f11 = aVar.f16451p0;
            if (f11 != -1.0f) {
                if (f11 > -1.0f) {
                    fVar.f16135u0 = f11;
                    fVar.v0 = -1;
                    fVar.f16136w0 = -1;
                    return;
                }
                return;
            }
            if (i14 != -1) {
                if (i14 > -1) {
                    fVar.f16135u0 = -1.0f;
                    fVar.v0 = i14;
                    fVar.f16136w0 = -1;
                    return;
                }
                return;
            }
            if (i15 == -1 || i15 <= -1) {
                return;
            }
            fVar.f16135u0 = -1.0f;
            fVar.v0 = -1;
            fVar.f16136w0 = i15;
            return;
        }
        int i16 = aVar.f16434g0;
        int i17 = aVar.f16436h0;
        int i18 = aVar.f16438i0;
        int i19 = aVar.f16439j0;
        int i20 = aVar.f16441k0;
        int i21 = aVar.f16443l0;
        float f12 = aVar.f16445m0;
        int i22 = aVar.f16450p;
        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f15936d;
        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.f15934b;
        ConstraintAnchor.Type type5 = ConstraintAnchor.Type.f15937e;
        ConstraintAnchor.Type type6 = ConstraintAnchor.Type.f15935c;
        if (i22 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i22);
            if (constraintWidget6 != null) {
                float f13 = aVar.f16454r;
                int i23 = aVar.f16452q;
                ConstraintAnchor.Type type7 = ConstraintAnchor.Type.f15939g;
                constraintWidget.z(type7, constraintWidget6, type7, i23, 0);
                constraintWidget.f15945D = f13;
            }
            f10 = 0.0f;
            type2 = type3;
            type = type4;
        } else {
            if (i16 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray.get(i16);
                if (constraintWidget7 != null) {
                    type = type4;
                    type2 = type3;
                    constraintWidget.z(type4, constraintWidget7, type4, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i20);
                } else {
                    type = type4;
                    type2 = type3;
                }
            } else {
                type = type4;
                type2 = type3;
                if (i17 != -1 && (constraintWidget2 = sparseArray.get(i17)) != null) {
                    constraintWidget.z(type, constraintWidget2, type2, ((ViewGroup.MarginLayoutParams) aVar).leftMargin, i20);
                }
            }
            if (i18 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i18);
                if (constraintWidget8 != null) {
                    constraintWidget.z(type2, constraintWidget8, type, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i21);
                }
            } else if (i19 != -1 && (constraintWidget3 = sparseArray.get(i19)) != null) {
                constraintWidget.z(type2, constraintWidget3, type2, ((ViewGroup.MarginLayoutParams) aVar).rightMargin, i21);
            }
            int i24 = aVar.f16437i;
            if (i24 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i24);
                if (constraintWidget9 != null) {
                    constraintWidget.z(type6, constraintWidget9, type6, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.f16460x);
                }
            } else {
                int i25 = aVar.j;
                if (i25 != -1 && (constraintWidget4 = sparseArray.get(i25)) != null) {
                    constraintWidget.z(type6, constraintWidget4, type5, ((ViewGroup.MarginLayoutParams) aVar).topMargin, aVar.f16460x);
                }
            }
            int i26 = aVar.f16440k;
            if (i26 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i26);
                if (constraintWidget10 != null) {
                    constraintWidget.z(type5, constraintWidget10, type6, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.f16462z);
                }
            } else {
                int i27 = aVar.f16442l;
                if (i27 != -1 && (constraintWidget5 = sparseArray.get(i27)) != null) {
                    constraintWidget.z(type5, constraintWidget5, type5, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, aVar.f16462z);
                }
            }
            int i28 = aVar.f16444m;
            if (i28 != -1) {
                p(constraintWidget, aVar, sparseArray, i28, ConstraintAnchor.Type.f15938f);
            } else {
                int i29 = aVar.f16446n;
                if (i29 != -1) {
                    p(constraintWidget, aVar, sparseArray, i29, type6);
                } else {
                    int i30 = aVar.f16448o;
                    if (i30 != -1) {
                        p(constraintWidget, aVar, sparseArray, i30, type5);
                    }
                }
            }
            f10 = 0.0f;
            if (f12 >= 0.0f) {
                constraintWidget.f15979f0 = f12;
            }
            float f14 = aVar.f16400F;
            if (f14 >= 0.0f) {
                constraintWidget.f15981g0 = f14;
            }
        }
        if (z10 && ((i12 = aVar.f16414T) != -1 || aVar.f16415U != -1)) {
            int i31 = aVar.f16415U;
            constraintWidget.f15969a0 = i12;
            constraintWidget.f15971b0 = i31;
        }
        boolean z11 = aVar.f16422a0;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.f16014c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.f16013b;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16016e;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.f16015d;
        if (z11) {
            constraintWidget.Q(dimensionBehaviour2);
            constraintWidget.S(((ViewGroup.MarginLayoutParams) aVar).width);
            if (((ViewGroup.MarginLayoutParams) aVar).width == -2) {
                constraintWidget.Q(dimensionBehaviour);
            }
        } else if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
            if (aVar.f16417W) {
                constraintWidget.Q(dimensionBehaviour4);
            } else {
                constraintWidget.Q(dimensionBehaviour3);
            }
            constraintWidget.m(type).f15931g = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            constraintWidget.m(type2).f15931g = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
        } else {
            constraintWidget.Q(dimensionBehaviour4);
            constraintWidget.S(0);
        }
        if (aVar.f16424b0) {
            constraintWidget.R(dimensionBehaviour2);
            constraintWidget.P(((ViewGroup.MarginLayoutParams) aVar).height);
            if (((ViewGroup.MarginLayoutParams) aVar).height == -2) {
                constraintWidget.R(dimensionBehaviour);
            }
        } else if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
            if (aVar.f16418X) {
                constraintWidget.R(dimensionBehaviour4);
            } else {
                constraintWidget.R(dimensionBehaviour3);
            }
            constraintWidget.m(type6).f15931g = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            constraintWidget.m(type5).f15931g = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
        } else {
            constraintWidget.R(dimensionBehaviour4);
            constraintWidget.P(0);
        }
        String str = aVar.f16401G;
        if (str == null || str.length() == 0) {
            constraintWidget.f15966Y = f10;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i10 = 1;
                i11 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i13 = 0;
                } else {
                    if (strSubstring.equalsIgnoreCase("H")) {
                        i10 = 1;
                        i13 = 1;
                    }
                    i11 = iIndexOf + i10;
                }
                i10 = 1;
                i11 = iIndexOf + i10;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - i10) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = f10;
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + i10);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = f10;
                    } else {
                        float f15 = Float.parseFloat(strSubstring3);
                        float f16 = Float.parseFloat(strSubstring4);
                        if (f15 <= f10 || f16 <= f10) {
                            fAbs = f10;
                        } else {
                            fAbs = i13 == 1 ? Math.abs(f16 / f15) : Math.abs(f15 / f16);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > f10) {
                constraintWidget.f15966Y = fAbs;
                constraintWidget.f15967Z = i13;
            }
        }
        float f17 = aVar.f16402H;
        float[] fArr = constraintWidget.f15994n0;
        fArr[0] = f17;
        fArr[1] = aVar.f16403I;
        constraintWidget.f15990l0 = aVar.f16404J;
        constraintWidget.f15992m0 = aVar.f16405K;
        int i32 = aVar.f16420Z;
        if (i32 >= 0 && i32 <= 3) {
            constraintWidget.f15999q = i32;
        }
        int i33 = aVar.f16406L;
        int i34 = aVar.f16408N;
        int i35 = aVar.f16410P;
        float f18 = aVar.f16412R;
        constraintWidget.f16001r = i33;
        constraintWidget.f16007u = i34;
        if (i35 == Integer.MAX_VALUE) {
            i35 = 0;
        }
        constraintWidget.f16008v = i35;
        constraintWidget.f16009w = f18;
        if (f18 > f10 && f18 < 1.0f && i33 == 0) {
            constraintWidget.f16001r = 2;
        }
        int i36 = aVar.f16407M;
        int i37 = aVar.f16409O;
        int i38 = aVar.f16411Q;
        float f19 = aVar.f16413S;
        constraintWidget.f16003s = i36;
        constraintWidget.f16010x = i37;
        constraintWidget.f16011y = i38 != Integer.MAX_VALUE ? i38 : 0;
        constraintWidget.f16012z = f19;
        if (f19 <= f10 || f19 >= 1.0f || i36 != 0) {
            return;
        }
        constraintWidget.f16003s = 2;
    }

    public final View c(int i10) {
        return this.f16381b.get(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final ConstraintWidget d(View view) {
        if (view == this) {
            return this.f16383d;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f16453q0;
        }
        view.setLayoutParams(new a(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a) {
            return ((a) view.getLayoutParams()).f16453q0;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f16382c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    public final void e(AttributeSet attributeSet, int i10) {
        androidx.constraintlayout.core.widgets.d dVar = this.f16383d;
        dVar.f15983h0 = this;
        b bVar = this.f16394p;
        dVar.f16091y0 = bVar;
        dVar.f16089w0.f36480f = bVar;
        this.f16381b.put(getId(), this);
        this.f16389k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p139l0.d.f44124b, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f16384e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16384e);
                } else if (index == 17) {
                    this.f16385f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16385f);
                } else if (index == 14) {
                    this.f16386g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16386g);
                } else if (index == 15) {
                    this.f16387h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16387h);
                } else if (index == 113) {
                    this.j = typedArrayObtainStyledAttributes.getInt(index, this.j);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            g(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f16390l = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
                        this.f16389k = bVar2;
                        bVar2.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f16389k = null;
                    }
                    this.f16391m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        dVar.f16080H0 = this.j;
        androidx.constraintlayout.core.c.f15903q = dVar.a0(512);
    }

    public final boolean f() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f16388i = true;
        super.forceLayout();
    }

    public void g(int i10) {
        this.f16390l = new p139l0.a(getContext(), this, i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f16387h;
    }

    public int getMaxWidth() {
        return this.f16386g;
    }

    public int getMinHeight() {
        return this.f16385f;
    }

    public int getMinWidth() {
        return this.f16384e;
    }

    public int getOptimizationLevel() {
        return this.f16383d.f16080H0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb2 = new StringBuilder();
        androidx.constraintlayout.core.widgets.d dVar = this.f16383d;
        if (dVar.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                dVar.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                dVar.j = "parent";
            }
        }
        if (dVar.f15988k0 == null) {
            dVar.f15988k0 = dVar.j;
        }
        for (ConstraintWidget constraintWidget : dVar.f35715u0) {
            View view = constraintWidget.f15983h0;
            if (view != null) {
                if (constraintWidget.j == null && (id = view.getId()) != -1) {
                    constraintWidget.j = getContext().getResources().getResourceEntryName(id);
                }
                if (constraintWidget.f15988k0 == null) {
                    constraintWidget.f15988k0 = constraintWidget.j;
                }
            }
        }
        dVar.r(sb2);
        return sb2.toString();
    }

    public final void h(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        b bVar = this.f16394p;
        int i14 = bVar.f16468e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + bVar.f16467d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f16386g, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f16387h, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:109:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:113:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:117:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:197:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:200:0x03c9 A[LOOP:11: B:198:0x03c3->B:200:0x03c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:202:0x040c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0428  */
    /* JADX WARN: Code duplicated, block: B:206:0x042f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0433  */
    /* JADX WARN: Code duplicated, block: B:210:0x043d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:211:0x043f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0441  */
    /* JADX WARN: Code duplicated, block: B:214:0x0444  */
    /* JADX WARN: Code duplicated, block: B:215:0x0446  */
    /* JADX WARN: Code duplicated, block: B:217:0x044b  */
    /* JADX WARN: Code duplicated, block: B:219:0x045f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0468  */
    /* JADX WARN: Code duplicated, block: B:225:0x0479  */
    /* JADX WARN: Code duplicated, block: B:227:0x0485  */
    /* JADX WARN: Code duplicated, block: B:228:0x048c  */
    /* JADX WARN: Code duplicated, block: B:246:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:252:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:254:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:26:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:275:0x04f7 A[PHI: r15
      0x04f7: PHI (r15v12 boolean) = (r15v11 boolean), (r15v11 boolean), (r15v11 boolean), (r15v15 boolean) binds: [B:253:0x04c8, B:255:0x04ce, B:257:0x04d2, B:273:0x04f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:280:0x0503  */
    /* JADX WARN: Code duplicated, block: B:281:0x0506  */
    /* JADX WARN: Code duplicated, block: B:285:0x0521  */
    /* JADX WARN: Code duplicated, block: B:287:0x0529  */
    /* JADX WARN: Code duplicated, block: B:290:0x0530  */
    /* JADX WARN: Code duplicated, block: B:292:0x054b  */
    /* JADX WARN: Code duplicated, block: B:295:0x055b  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:300:0x0573  */
    /* JADX WARN: Code duplicated, block: B:302:0x0576 A[LOOP:5: B:301:0x0574->B:302:0x0576, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:303:0x0582  */
    /* JADX WARN: Code duplicated, block: B:306:0x058f  */
    /* JADX WARN: Code duplicated, block: B:307:0x0598  */
    /* JADX WARN: Code duplicated, block: B:309:0x059f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:311:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:313:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:316:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:317:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:321:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:323:0x05df  */
    /* JADX WARN: Code duplicated, block: B:324:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:326:0x060c  */
    /* JADX WARN: Code duplicated, block: B:328:0x0611  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:332:0x0630  */
    /* JADX WARN: Code duplicated, block: B:334:0x0634  */
    /* JADX WARN: Code duplicated, block: B:336:0x0639  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:344:0x067e  */
    /* JADX WARN: Code duplicated, block: B:346:0x0681  */
    /* JADX WARN: Code duplicated, block: B:348:0x068b  */
    /* JADX WARN: Code duplicated, block: B:352:0x0693  */
    /* JADX WARN: Code duplicated, block: B:358:0x069f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:366:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:369:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:372:0x06df  */
    /* JADX WARN: Code duplicated, block: B:374:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:378:0x0703  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:380:0x0707  */
    /* JADX WARN: Code duplicated, block: B:382:0x070c  */
    /* JADX WARN: Code duplicated, block: B:388:0x072e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:391:0x0734  */
    /* JADX WARN: Code duplicated, block: B:395:0x0744 A[LOOP:7: B:343:0x067c->B:395:0x0744, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:430:0x0568 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0568 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x0670 A[EDGE_INSN: B:433:0x0670->B:342:0x0670 BREAK  A[LOOP:6: B:319:0x05cb->B:341:0x065d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0757 A[EDGE_INSN: B:436:0x0757->B:396:0x0757 BREAK  A[LOOP:7: B:343:0x067c->B:395:0x0744], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:49:0x012d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0134  */
    /* JADX WARN: Code duplicated, block: B:53:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x015c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:63:0x016a  */
    /* JADX WARN: Code duplicated, block: B:65:0x016d  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:72:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x0189  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0197  */
    /* JADX WARN: Code duplicated, block: B:82:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c6 A[ADDED_TO_REGION] */
    public final void i(androidx.constraintlayout.core.widgets.d dVar, int i10, int i11, int i12) {
        int iMax;
        int iMax2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int iU;
        p101i0.e eVar;
        int i13;
        int i14;
        p101i0.b bVar;
        p101i0.b.InterfaceC0381b interfaceC0381b;
        int size;
        int iU2;
        int iO;
        boolean zB;
        boolean z10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        boolean z11;
        boolean z12;
        p101i0.b.InterfaceC0381b interfaceC0381b2;
        int i15;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        int i16;
        boolean zY;
        int i17;
        p101i0.b bVar2;
        ArrayList<ConstraintWidget> arrayList;
        int size2;
        int i18;
        int i19;
        int i20;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr;
        int i21;
        int i22;
        int iMax3;
        int iMax4;
        int i23;
        int i24;
        ConstraintAnchor.Type type;
        ConstraintAnchor.Type type2;
        int i25;
        p101i0.b.InterfaceC0381b interfaceC0381b3;
        int i26;
        int i27;
        int i28;
        int i29;
        ArrayList<ConstraintWidget> arrayList2;
        int i30;
        ConstraintWidget constraintWidget;
        int iU3;
        int iO2;
        ArrayList<ConstraintWidget> arrayList3;
        int i31;
        int i32;
        int iU4;
        int iO3;
        int i33;
        ConstraintWidget constraintWidget2;
        int iU5;
        int iO4;
        p101i0.b.InterfaceC0381b interfaceC0381b4;
        int i34;
        int iU6;
        int iO5;
        int i35;
        int size3;
        p101i0.b.InterfaceC0381b interfaceC0381b5;
        int i36;
        ConstraintLayout constraintLayout;
        int childCount;
        int i37;
        ArrayList<androidx.constraintlayout.widget.a> arrayList4;
        int size4;
        int i38;
        View childAt;
        e eVar2;
        a aVar;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourN;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        boolean z13;
        p101i0.b bVar3;
        androidx.constraintlayout.core.widgets.analyzer.c cVar;
        androidx.constraintlayout.core.widgets.analyzer.d dVar2;
        int iMin;
        int iMin2;
        int i39;
        boolean z14;
        androidx.constraintlayout.core.widgets.d dVar3;
        int i40;
        int i41;
        boolean z15;
        boolean z16;
        int i42;
        boolean z17;
        boolean z18;
        int i43;
        ConstraintWidget constraintWidget7;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2;
        boolean z19;
        boolean z20;
        boolean z21;
        androidx.constraintlayout.core.widgets.d dVar4 = dVar;
        int mode = View.MeasureSpec.getMode(i11);
        int size5 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size6 = View.MeasureSpec.getSize(i12);
        int iMax5 = Math.max(0, getPaddingTop());
        int iMax6 = Math.max(0, getPaddingBottom());
        int i44 = iMax5 + iMax6;
        int paddingWidth = getPaddingWidth();
        b bVar4 = this.f16394p;
        bVar4.f16465b = iMax5;
        bVar4.f16466c = iMax6;
        bVar4.f16467d = paddingWidth;
        bVar4.f16468e = i44;
        bVar4.f16469f = i11;
        bVar4.f16470g = i12;
        int iMax7 = Math.max(0, getPaddingStart());
        int iMax8 = Math.max(0, getPaddingEnd());
        if (iMax7 <= 0 && iMax8 <= 0) {
            iMax7 = Math.max(0, getPaddingLeft());
        } else if (f()) {
            iMax7 = iMax8;
        }
        int i45 = size5 - paddingWidth;
        int i46 = size6 - i44;
        int i47 = bVar4.f16468e;
        int i48 = bVar4.f16467d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f16013b;
        int childCount2 = getChildCount();
        dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.f16014c;
        int i49 = Integer.MIN_VALUE;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                if (childCount2 == 0) {
                    iMax = Math.max(0, this.f16384e);
                } else {
                    iMax = 0;
                }
                i49 = Integer.MIN_VALUE;
            } else if (mode != 1073741824) {
                dimensionBehaviour7 = dimensionBehaviour7;
                iMax = 0;
            } else {
                iMax = Math.min(this.f16386g - i48, i45);
                dimensionBehaviour7 = dimensionBehaviour7;
            }
            if (mode2 != i49) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        dimensionBehaviour = dimensionBehaviour7;
                        dimensionBehaviour2 = dimensionBehaviour7;
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.f16387h - i47, i46);
                        dimensionBehaviour2 = dimensionBehaviour7;
                        dimensionBehaviour = dimensionBehaviour7;
                    }
                } else if (childCount2 == 0) {
                    dimensionBehaviour = dimensionBehaviour7;
                    dimensionBehaviour2 = dimensionBehaviour;
                    iMax2 = Math.max(0, this.f16385f);
                } else {
                    iMax2 = 0;
                }
                iU = dVar.u();
                eVar = dVar4.f16089w0;
                if (iMax == iU || iMax2 != dVar.o()) {
                    eVar.f36477c = true;
                }
                dVar4.f15969a0 = 0;
                dVar4.f15971b0 = 0;
                int i50 = this.f16386g - i48;
                int[] iArr = dVar4.f15944C;
                iArr[0] = i50;
                iArr[1] = this.f16387h - i47;
                dVar4.f15975d0 = 0;
                dVar4.f15977e0 = 0;
                dVar4.Q(dimensionBehaviour7);
                dVar4.S(iMax);
                dVar4.R(dimensionBehaviour);
                dVar4.P(iMax2);
                i13 = this.f16384e - i48;
                if (i13 < 0) {
                    dVar4.f15975d0 = 0;
                } else {
                    dVar4.f15975d0 = i13;
                }
                i14 = this.f16385f - i47;
                if (i14 < 0) {
                    dVar4.f15977e0 = 0;
                } else {
                    dVar4.f15977e0 = i14;
                }
                dVar4.f16074B0 = iMax7;
                dVar4.f16075C0 = iMax5;
                bVar = dVar4.v0;
                bVar.getClass();
                interfaceC0381b = dVar4.f16091y0;
                size = dVar4.f35715u0.size();
                iU2 = dVar.u();
                iO = dVar.o();
                zB = g.b(i10, 128);
                if (!zB || g.b(i10, 64)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16015d;
                if (z10) {
                    i43 = 0;
                    while (i43 < size) {
                        constraintWidget7 = dVar4.f35715u0.get(i43);
                        dimensionBehaviourArr2 = constraintWidget7.f15962U;
                        if (dimensionBehaviourArr2[0] == dimensionBehaviour3) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (dimensionBehaviourArr2[1] == dimensionBehaviour3) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (z19 || !z20 || constraintWidget7.f15966Y <= 0.0f) {
                            z21 = false;
                        } else {
                            z21 = true;
                        }
                        if ((!constraintWidget7.B() && z21) || ((constraintWidget7.C() && z21) || (constraintWidget7 instanceof i) || constraintWidget7.B() || constraintWidget7.C())) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z11 = z10 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
                if (z11) {
                    iMin = Math.min(dVar4.f15944C[0], i45);
                    iMin2 = Math.min(dVar4.f15944C[1], i46);
                    if (mode == 1073741824) {
                        if (dVar.u() != iMin) {
                            dVar4.S(iMin);
                            dVar4.f16089w0.f36476b = true;
                        }
                        i39 = 1073741824;
                    } else {
                        i39 = 1073741824;
                    }
                    if (mode2 == i39 && dVar.o() != iMin2) {
                        dVar4.P(iMin2);
                        dVar4.f16089w0.f36476b = true;
                    }
                    if (mode == i39 || mode2 != i39) {
                        z12 = z11;
                        bVar = bVar;
                        i15 = iU2;
                        dimensionBehaviour4 = dimensionBehaviour2;
                        interfaceC0381b2 = interfaceC0381b;
                        iO = iO;
                        dimensionBehaviour5 = dimensionBehaviour7;
                        dimensionBehaviour3 = dimensionBehaviour3;
                        z14 = eVar.f36476b;
                        dVar3 = eVar.f36475a;
                        if (z14) {
                            for (ConstraintWidget constraintWidget8 : dVar3.f35715u0) {
                                constraintWidget8.l();
                                constraintWidget8.f15968a = false;
                                androidx.constraintlayout.core.widgets.analyzer.c cVar2 = constraintWidget8.f15974d;
                                cVar2.f16045e.j = false;
                                cVar2.f16047g = false;
                                cVar2.n();
                                androidx.constraintlayout.core.widgets.analyzer.d dVar5 = constraintWidget8.f15976e;
                                dVar5.f16045e.j = false;
                                dVar5.f16047g = false;
                                dVar5.m();
                            }
                            i40 = 0;
                            dVar3.l();
                            dVar3.f15968a = false;
                            androidx.constraintlayout.core.widgets.analyzer.c cVar3 = dVar3.f15974d;
                            cVar3.f16045e.j = false;
                            cVar3.f16047g = false;
                            cVar3.n();
                            androidx.constraintlayout.core.widgets.analyzer.d dVar6 = dVar3.f15976e;
                            dVar6.f16045e.j = false;
                            dVar6.f16047g = false;
                            dVar6.m();
                            eVar.c();
                        } else {
                            i40 = 0;
                        }
                        eVar.b(eVar.f36478d);
                        dVar3.f15969a0 = i40;
                        dVar3.f15971b0 = i40;
                        dVar3.f15974d.f16048h.d(i40);
                        dVar3.f15976e.f16048h.d(i40);
                        i41 = 1073741824;
                        if (mode == 1073741824) {
                            zY = dVar4.Y(i40, zB);
                            i16 = 1;
                        } else {
                            i16 = 0;
                            zY = true;
                        }
                        if (mode2 == 1073741824) {
                            zY &= dVar4.Y(1, zB);
                            i16++;
                        }
                    } else {
                        boolean z22 = eVar.f36476b;
                        androidx.constraintlayout.core.widgets.d dVar7 = eVar.f36475a;
                        if (z22 || eVar.f36477c) {
                            for (ConstraintWidget constraintWidget9 : dVar7.f35715u0) {
                                constraintWidget9.l();
                                constraintWidget9.f15968a = false;
                                constraintWidget9.f15974d.n();
                                constraintWidget9.f15976e.m();
                            }
                            dVar7.l();
                            i42 = 0;
                            dVar7.f15968a = false;
                            dVar7.f15974d.n();
                            dVar7.f15976e.m();
                            eVar.f36477c = false;
                        } else {
                            i42 = 0;
                        }
                        eVar.b(eVar.f36478d);
                        dVar7.f15969a0 = i42;
                        dVar7.f15971b0 = i42;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviourN2 = dVar7.n(i42);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviourN3 = dVar7.n(1);
                        if (eVar.f36476b) {
                            eVar.c();
                        }
                        int iV = dVar7.v();
                        z12 = z11;
                        int iW = dVar7.w();
                        interfaceC0381b2 = interfaceC0381b;
                        dVar7.f15974d.f16048h.d(iV);
                        dVar7.f15976e.f16048h.d(iW);
                        eVar.g();
                        ArrayList<WidgetRun> arrayList5 = eVar.f36479e;
                        i15 = iU2;
                        dimensionBehaviour4 = dimensionBehaviour2;
                        if (dimensionBehaviourN2 == dimensionBehaviour4 || dimensionBehaviourN3 == dimensionBehaviour4) {
                            if (zB) {
                                Iterator<WidgetRun> it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    if (!it.next().k()) {
                                        zB = false;
                                        break;
                                    }
                                }
                            }
                            if (zB && dimensionBehaviourN2 == dimensionBehaviour4) {
                                dimensionBehaviour5 = dimensionBehaviour7;
                                dVar7.Q(dimensionBehaviour5);
                                dVar7.S(eVar.d(dVar7, 0));
                                dVar7.f15974d.f16045e.d(dVar7.u());
                            } else {
                                dimensionBehaviour5 = dimensionBehaviour7;
                            }
                            if (zB && dimensionBehaviourN3 == dimensionBehaviour4) {
                                dVar7.R(dimensionBehaviour5);
                                dVar7.P(eVar.d(dVar7, 1));
                                dVar7.f15976e.f16045e.d(dVar7.o());
                            }
                        } else {
                            bVar = bVar;
                            iO = iO;
                            dimensionBehaviour5 = dimensionBehaviour7;
                            dimensionBehaviour3 = dimensionBehaviour3;
                        }
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dVar7.f15962U[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.f16016e;
                        if (dimensionBehaviour8 == dimensionBehaviour5 || dimensionBehaviour8 == dimensionBehaviour9) {
                            int iU7 = dVar7.u() + iV;
                            dVar7.f15974d.f16049i.d(iU7);
                            dVar7.f15974d.f16045e.d(iU7 - iV);
                            eVar.g();
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = dVar7.f15962U[1];
                            if (dimensionBehaviour10 == dimensionBehaviour5 || dimensionBehaviour10 == dimensionBehaviour9) {
                                int iO6 = dVar7.o() + iW;
                                dVar7.f15976e.f16049i.d(iO6);
                                dVar7.f15976e.f16045e.d(iO6 - iW);
                            }
                            eVar.g();
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        for (WidgetRun widgetRun : arrayList5) {
                            if (widgetRun.f16042b != dVar7 || widgetRun.f16047g) {
                                widgetRun.e();
                            }
                        }
                        Iterator<WidgetRun> it2 = arrayList5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z18 = true;
                                break;
                            }
                            WidgetRun next = it2.next();
                            if (z17 || next.f16042b != dVar7) {
                                if (!next.f16048h.j || ((!next.f16049i.j && !(next instanceof h)) || (!next.f16045e.j && !(next instanceof p101i0.c) && !(next instanceof h)))) {
                                    z18 = false;
                                    break;
                                }
                            }
                        }
                        dVar7.Q(dimensionBehaviourN2);
                        dVar7.R(dimensionBehaviourN3);
                        zY = z18;
                        i41 = 1073741824;
                        i16 = 2;
                    }
                    if (zY) {
                        if (mode == i41) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (mode2 == i41) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        dVar4.T(z15, z16);
                    }
                } else {
                    z12 = z11;
                    bVar = bVar;
                    interfaceC0381b2 = interfaceC0381b;
                    i15 = iU2;
                    dimensionBehaviour4 = dimensionBehaviour2;
                    iO = iO;
                    dimensionBehaviour5 = dimensionBehaviour7;
                    dimensionBehaviour3 = dimensionBehaviour3;
                    i16 = 0;
                    zY = false;
                }
                if (zY || i16 != 2) {
                    i17 = dVar4.f16080H0;
                    if (size > 0) {
                        size3 = dVar4.f35715u0.size();
                        boolean zA0 = dVar4.a0(64);
                        interfaceC0381b5 = dVar4.f16091y0;
                        i36 = 0;
                        while (i36 < size3) {
                            constraintWidget6 = dVar4.f35715u0.get(i36);
                            if (!(constraintWidget6 instanceof f) || (constraintWidget6 instanceof androidx.constraintlayout.core.widgets.a) || constraintWidget6.f15948G || (zA0 && (cVar = constraintWidget6.f15974d) != null && (dVar2 = constraintWidget6.f15976e) != null && cVar.f16045e.j && dVar2.f16045e.j)) {
                                dimensionBehaviour6 = dimensionBehaviour3;
                                bVar3 = bVar;
                            } else {
                                dimensionBehaviourN = constraintWidget6.n(0);
                                ConstraintWidget.DimensionBehaviour dimensionBehaviourN4 = constraintWidget6.n(1);
                                dimensionBehaviour6 = dimensionBehaviour3;
                                if (dimensionBehaviourN == dimensionBehaviour6 || constraintWidget6.f16001r == 1 || dimensionBehaviourN4 != dimensionBehaviour6 || constraintWidget6.f16003s == 1) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (z13 && dVar4.a0(1) && !(constraintWidget6 instanceof i)) {
                                    if (dimensionBehaviourN == dimensionBehaviour6 && constraintWidget6.f16001r == 0 && dimensionBehaviourN4 != dimensionBehaviour6 && !constraintWidget6.B()) {
                                        z13 = true;
                                    }
                                    if (dimensionBehaviourN4 == dimensionBehaviour6 && constraintWidget6.f16003s == 0 && dimensionBehaviourN != dimensionBehaviour6 && !constraintWidget6.B()) {
                                        z13 = true;
                                    }
                                    if (dimensionBehaviourN == dimensionBehaviour6 || dimensionBehaviourN4 == dimensionBehaviour6) {
                                        if (constraintWidget6.f15966Y > 0.0f) {
                                            z13 = true;
                                        }
                                    }
                                }
                                if (z13) {
                                    bVar3 = bVar;
                                } else {
                                    bVar3 = bVar;
                                    bVar3.a(0, constraintWidget6, interfaceC0381b5);
                                }
                            }
                            i36++;
                            bVar = bVar3;
                            dimensionBehaviour3 = dimensionBehaviour6;
                        }
                        bVar2 = bVar;
                        constraintLayout = ((b) interfaceC0381b5).f16464a;
                        childCount = constraintLayout.getChildCount();
                        for (i37 = 0; i37 < childCount; i37++) {
                            childAt = constraintLayout.getChildAt(i37);
                            if (childAt instanceof e) {
                                eVar2 = (e) childAt;
                                if (eVar2.f16622c == null) {
                                    a aVar2 = (a) eVar2.getLayoutParams();
                                    aVar = (a) eVar2.f16622c.getLayoutParams();
                                    constraintWidget3 = aVar.f16453q0;
                                    constraintWidget3.f15985i0 = 0;
                                    constraintWidget4 = aVar2.f16453q0;
                                    if (constraintWidget4.f15962U[0] != dimensionBehaviour5) {
                                        constraintWidget4.S(constraintWidget3.u());
                                    }
                                    constraintWidget5 = aVar2.f16453q0;
                                    if (constraintWidget5.f15962U[1] != dimensionBehaviour5) {
                                        constraintWidget5.P(aVar.f16453q0.o());
                                    }
                                    aVar.f16453q0.f15985i0 = 8;
                                }
                            }
                        }
                        arrayList4 = constraintLayout.f16382c;
                        size4 = arrayList4.size();
                        if (size4 > 0) {
                            for (i38 = 0; i38 < size4; i38++) {
                                arrayList4.get(i38).getClass();
                            }
                        }
                    } else {
                        bVar2 = bVar;
                    }
                    bVar2.c(dVar4);
                    arrayList = bVar2.f36461a;
                    size2 = arrayList.size();
                    if (size > 0) {
                        i18 = iO;
                        i19 = i15;
                        i20 = 0;
                        bVar2.b(dVar4, 0, i19, i18);
                    } else {
                        i18 = iO;
                        i19 = i15;
                        i20 = 0;
                    }
                    if (size2 > 0) {
                        dimensionBehaviourArr = dVar4.f15962U;
                        if (dimensionBehaviourArr[i20] == dimensionBehaviour4) {
                            i21 = 1;
                        } else {
                            i21 = i20;
                        }
                        if (dimensionBehaviourArr[1] == dimensionBehaviour4) {
                            i22 = 1;
                        } else {
                            i22 = i20;
                        }
                        int iU8 = dVar.u();
                        androidx.constraintlayout.core.widgets.d dVar8 = bVar2.f36463c;
                        iMax3 = Math.max(iU8, dVar8.f15975d0);
                        iMax4 = Math.max(dVar.o(), dVar8.f15977e0);
                        i23 = i20;
                        i24 = i23;
                        while (true) {
                            type = ConstraintAnchor.Type.f15937e;
                            type2 = ConstraintAnchor.Type.f15936d;
                            if (i23 < size2) {
                                break;
                            }
                            constraintWidget2 = arrayList.get(i23);
                            int i51 = i17;
                            if (constraintWidget2 instanceof i) {
                                iU5 = constraintWidget2.u();
                                iO4 = constraintWidget2.o();
                                interfaceC0381b4 = interfaceC0381b2;
                                i34 = i24 | (bVar2.a(1, constraintWidget2, interfaceC0381b4) ? 1 : 0);
                                iU6 = constraintWidget2.u();
                                iO5 = constraintWidget2.o();
                                if (iU6 != iU5) {
                                    constraintWidget2.S(iU6);
                                    if (i21 != 0 && constraintWidget2.v() + constraintWidget2.f15964W > iMax3) {
                                        iMax3 = Math.max(iMax3, constraintWidget2.m(type2).e() + constraintWidget2.v() + constraintWidget2.f15964W);
                                    }
                                    i35 = 1;
                                } else {
                                    i35 = i34;
                                }
                                if (iO5 != iO4) {
                                    constraintWidget2.P(iO5);
                                    if (i22 != 0 && constraintWidget2.w() + constraintWidget2.f15965X > iMax4) {
                                        iMax4 = Math.max(iMax4, constraintWidget2.m(type).e() + constraintWidget2.w() + constraintWidget2.f15965X);
                                    }
                                    i35 = 1;
                                }
                                i24 = i35 | (((i) constraintWidget2).f16143C0 ? 1 : 0);
                            } else {
                                interfaceC0381b4 = interfaceC0381b2;
                            }
                            i23++;
                            i17 = i51;
                            i19 = i19;
                            interfaceC0381b2 = interfaceC0381b4;
                            i18 = i18;
                        }
                        int i52 = i17;
                        i25 = i19;
                        interfaceC0381b3 = interfaceC0381b2;
                        i26 = i18;
                        i27 = 0;
                        i28 = 2;
                        while (i27 < i28) {
                            i29 = 0;
                            while (i29 < size2) {
                                constraintWidget = arrayList.get(i29);
                                if (((constraintWidget instanceof p089h0.a) || (constraintWidget instanceof i)) && !(constraintWidget instanceof f)) {
                                    if (constraintWidget.f15985i0 == 8 && ((!z12 || !constraintWidget.f15974d.f16045e.j || !constraintWidget.f15976e.f16045e.j) && !(constraintWidget instanceof i))) {
                                        iU3 = constraintWidget.u();
                                        iO2 = constraintWidget.o();
                                        arrayList3 = arrayList;
                                        int i53 = constraintWidget.f15973c0;
                                        i31 = size2;
                                        i32 = (bVar2.a(i27 == 1 ? 2 : 1, constraintWidget, interfaceC0381b3) ? 1 : 0) | i24;
                                        iU4 = constraintWidget.u();
                                        iO3 = constraintWidget.o();
                                        if (iU4 != iU3) {
                                            constraintWidget.S(iU4);
                                            if (i21 != 0 && constraintWidget.v() + constraintWidget.f15964W > iMax3) {
                                                iMax3 = Math.max(iMax3, constraintWidget.m(type2).e() + constraintWidget.v() + constraintWidget.f15964W);
                                            }
                                            i33 = 1;
                                        } else {
                                            i33 = i32;
                                        }
                                        if (iO3 != iO2) {
                                            constraintWidget.P(iO3);
                                            if (i22 != 0 && constraintWidget.w() + constraintWidget.f15965X > iMax4) {
                                                iMax4 = Math.max(iMax4, constraintWidget.m(type).e() + constraintWidget.w() + constraintWidget.f15965X);
                                            }
                                            i33 = 1;
                                        }
                                        if (constraintWidget.f15946E || i53 == constraintWidget.f15973c0) {
                                            i24 = i33;
                                        } else {
                                            i24 = 1;
                                        }
                                    }
                                    i29++;
                                    size2 = i31;
                                    arrayList = arrayList3;
                                }
                                arrayList3 = arrayList;
                                i31 = size2;
                                i29++;
                                size2 = i31;
                                arrayList = arrayList3;
                            }
                            arrayList2 = arrayList;
                            i30 = size2;
                            if (i24 != 0) {
                                break;
                            }
                            i27++;
                            bVar2.b(dVar, i27, i25, i26);
                            size2 = i30;
                            arrayList = arrayList2;
                            i28 = 2;
                            i24 = 0;
                        }
                        dVar4 = dVar;
                        i17 = i52;
                    }
                    dVar4.f16080H0 = i17;
                    androidx.constraintlayout.core.c.f15903q = dVar4.a0(512);
                }
                return;
            }
            if (childCount2 == 0) {
                iMax2 = Math.max(0, this.f16385f);
            } else {
                iMax2 = i46;
            }
            dimensionBehaviour = dimensionBehaviour7;
            dimensionBehaviour2 = dimensionBehaviour;
            iU = dVar.u();
            eVar = dVar4.f16089w0;
            if (iMax == iU) {
                eVar.f36477c = true;
            } else {
                eVar.f36477c = true;
            }
            dVar4.f15969a0 = 0;
            dVar4.f15971b0 = 0;
            int i54 = this.f16386g - i48;
            int[] iArr2 = dVar4.f15944C;
            iArr2[0] = i54;
            iArr2[1] = this.f16387h - i47;
            dVar4.f15975d0 = 0;
            dVar4.f15977e0 = 0;
            dVar4.Q(dimensionBehaviour7);
            dVar4.S(iMax);
            dVar4.R(dimensionBehaviour);
            dVar4.P(iMax2);
            i13 = this.f16384e - i48;
            if (i13 < 0) {
                dVar4.f15975d0 = 0;
            } else {
                dVar4.f15975d0 = i13;
            }
            i14 = this.f16385f - i47;
            if (i14 < 0) {
                dVar4.f15977e0 = 0;
            } else {
                dVar4.f15977e0 = i14;
            }
            dVar4.f16074B0 = iMax7;
            dVar4.f16075C0 = iMax5;
            bVar = dVar4.v0;
            bVar.getClass();
            interfaceC0381b = dVar4.f16091y0;
            size = dVar4.f35715u0.size();
            iU2 = dVar.u();
            iO = dVar.o();
            zB = g.b(i10, 128);
            if (zB) {
                z10 = true;
            } else {
                z10 = true;
            }
            dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16015d;
            if (z10) {
                i43 = 0;
                while (i43 < size) {
                    constraintWidget7 = dVar4.f35715u0.get(i43);
                    dimensionBehaviourArr2 = constraintWidget7.f15962U;
                    if (dimensionBehaviourArr2[0] == dimensionBehaviour3) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour3) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (z19) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    i43 = !constraintWidget7.B() ? i43 + 1 : i43 + 1;
                    z10 = false;
                    break;
                }
            }
            z11 = z10 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
            if (z11) {
                iMin = Math.min(dVar4.f15944C[0], i45);
                iMin2 = Math.min(dVar4.f15944C[1], i46);
                if (mode == 1073741824) {
                    if (dVar.u() != iMin) {
                        dVar4.S(iMin);
                        dVar4.f16089w0.f36476b = true;
                    }
                    i39 = 1073741824;
                } else {
                    i39 = 1073741824;
                }
                if (mode2 == i39) {
                    dVar4.P(iMin2);
                    dVar4.f16089w0.f36476b = true;
                }
                if (mode == i39) {
                    z12 = z11;
                    bVar = bVar;
                    i15 = iU2;
                    dimensionBehaviour4 = dimensionBehaviour2;
                    interfaceC0381b2 = interfaceC0381b;
                    iO = iO;
                    dimensionBehaviour5 = dimensionBehaviour7;
                    dimensionBehaviour3 = dimensionBehaviour3;
                    z14 = eVar.f36476b;
                    dVar3 = eVar.f36475a;
                    if (z14) {
                        while (r0.hasNext()) {
                            constraintWidget8.l();
                            constraintWidget8.f15968a = false;
                            androidx.constraintlayout.core.widgets.analyzer.c cVar4 = constraintWidget8.f15974d;
                            cVar4.f16045e.j = false;
                            cVar4.f16047g = false;
                            cVar4.n();
                            androidx.constraintlayout.core.widgets.analyzer.d dVar9 = constraintWidget8.f15976e;
                            dVar9.f16045e.j = false;
                            dVar9.f16047g = false;
                            dVar9.m();
                        }
                        i40 = 0;
                        dVar3.l();
                        dVar3.f15968a = false;
                        androidx.constraintlayout.core.widgets.analyzer.c cVar5 = dVar3.f15974d;
                        cVar5.f16045e.j = false;
                        cVar5.f16047g = false;
                        cVar5.n();
                        androidx.constraintlayout.core.widgets.analyzer.d dVar10 = dVar3.f15976e;
                        dVar10.f16045e.j = false;
                        dVar10.f16047g = false;
                        dVar10.m();
                        eVar.c();
                    } else {
                        i40 = 0;
                    }
                    eVar.b(eVar.f36478d);
                    dVar3.f15969a0 = i40;
                    dVar3.f15971b0 = i40;
                    dVar3.f15974d.f16048h.d(i40);
                    dVar3.f15976e.f16048h.d(i40);
                    i41 = 1073741824;
                    if (mode == 1073741824) {
                        zY = dVar4.Y(i40, zB);
                        i16 = 1;
                    } else {
                        i16 = 0;
                        zY = true;
                    }
                    if (mode2 == 1073741824) {
                        zY &= dVar4.Y(1, zB);
                        i16++;
                    }
                } else {
                    z12 = z11;
                    bVar = bVar;
                    i15 = iU2;
                    dimensionBehaviour4 = dimensionBehaviour2;
                    interfaceC0381b2 = interfaceC0381b;
                    iO = iO;
                    dimensionBehaviour5 = dimensionBehaviour7;
                    dimensionBehaviour3 = dimensionBehaviour3;
                    z14 = eVar.f36476b;
                    dVar3 = eVar.f36475a;
                    if (z14) {
                        while (r0.hasNext()) {
                            constraintWidget8.l();
                            constraintWidget8.f15968a = false;
                            androidx.constraintlayout.core.widgets.analyzer.c cVar6 = constraintWidget8.f15974d;
                            cVar6.f16045e.j = false;
                            cVar6.f16047g = false;
                            cVar6.n();
                            androidx.constraintlayout.core.widgets.analyzer.d dVar11 = constraintWidget8.f15976e;
                            dVar11.f16045e.j = false;
                            dVar11.f16047g = false;
                            dVar11.m();
                        }
                        i40 = 0;
                        dVar3.l();
                        dVar3.f15968a = false;
                        androidx.constraintlayout.core.widgets.analyzer.c cVar7 = dVar3.f15974d;
                        cVar7.f16045e.j = false;
                        cVar7.f16047g = false;
                        cVar7.n();
                        androidx.constraintlayout.core.widgets.analyzer.d dVar12 = dVar3.f15976e;
                        dVar12.f16045e.j = false;
                        dVar12.f16047g = false;
                        dVar12.m();
                        eVar.c();
                    } else {
                        i40 = 0;
                    }
                    eVar.b(eVar.f36478d);
                    dVar3.f15969a0 = i40;
                    dVar3.f15971b0 = i40;
                    dVar3.f15974d.f16048h.d(i40);
                    dVar3.f15976e.f16048h.d(i40);
                    i41 = 1073741824;
                    if (mode == 1073741824) {
                        zY = dVar4.Y(i40, zB);
                        i16 = 1;
                    } else {
                        i16 = 0;
                        zY = true;
                    }
                    if (mode2 == 1073741824) {
                        zY &= dVar4.Y(1, zB);
                        i16++;
                    }
                }
                if (zY) {
                    if (mode == i41) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (mode2 == i41) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    dVar4.T(z15, z16);
                }
            } else {
                z12 = z11;
                bVar = bVar;
                interfaceC0381b2 = interfaceC0381b;
                i15 = iU2;
                dimensionBehaviour4 = dimensionBehaviour2;
                iO = iO;
                dimensionBehaviour5 = dimensionBehaviour7;
                dimensionBehaviour3 = dimensionBehaviour3;
                i16 = 0;
                zY = false;
            }
            if (zY) {
            }
            i17 = dVar4.f16080H0;
            if (size > 0) {
                size3 = dVar4.f35715u0.size();
                boolean zA1 = dVar4.a0(64);
                interfaceC0381b5 = dVar4.f16091y0;
                i36 = 0;
                while (i36 < size3) {
                    constraintWidget6 = dVar4.f35715u0.get(i36);
                    if (!(constraintWidget6 instanceof f)) {
                        dimensionBehaviour6 = dimensionBehaviour3;
                        bVar3 = bVar;
                    } else {
                        dimensionBehaviourN = constraintWidget6.n(0);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviourN5 = constraintWidget6.n(1);
                        dimensionBehaviour6 = dimensionBehaviour3;
                        if (dimensionBehaviourN == dimensionBehaviour6) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                        }
                        if (z13) {
                            bVar3 = bVar;
                        } else {
                            bVar3 = bVar;
                            bVar3.a(0, constraintWidget6, interfaceC0381b5);
                        }
                    }
                    i36++;
                    bVar = bVar3;
                    dimensionBehaviour3 = dimensionBehaviour6;
                }
                bVar2 = bVar;
                constraintLayout = ((b) interfaceC0381b5).f16464a;
                childCount = constraintLayout.getChildCount();
                while (i37 < childCount) {
                    childAt = constraintLayout.getChildAt(i37);
                    if (childAt instanceof e) {
                        eVar2 = (e) childAt;
                        if (eVar2.f16622c == null) {
                            a aVar3 = (a) eVar2.getLayoutParams();
                            aVar = (a) eVar2.f16622c.getLayoutParams();
                            constraintWidget3 = aVar.f16453q0;
                            constraintWidget3.f15985i0 = 0;
                            constraintWidget4 = aVar3.f16453q0;
                            if (constraintWidget4.f15962U[0] != dimensionBehaviour5) {
                                constraintWidget4.S(constraintWidget3.u());
                            }
                            constraintWidget5 = aVar3.f16453q0;
                            if (constraintWidget5.f15962U[1] != dimensionBehaviour5) {
                                constraintWidget5.P(aVar.f16453q0.o());
                            }
                            aVar.f16453q0.f15985i0 = 8;
                        }
                    }
                }
                arrayList4 = constraintLayout.f16382c;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i38 < size4) {
                        arrayList4.get(i38).getClass();
                    }
                }
            } else {
                bVar2 = bVar;
            }
            bVar2.c(dVar4);
            arrayList = bVar2.f36461a;
            size2 = arrayList.size();
            if (size > 0) {
                i18 = iO;
                i19 = i15;
                i20 = 0;
                bVar2.b(dVar4, 0, i19, i18);
            } else {
                i18 = iO;
                i19 = i15;
                i20 = 0;
            }
            if (size2 > 0) {
                dimensionBehaviourArr = dVar4.f15962U;
                if (dimensionBehaviourArr[i20] == dimensionBehaviour4) {
                    i21 = 1;
                } else {
                    i21 = i20;
                }
                if (dimensionBehaviourArr[1] == dimensionBehaviour4) {
                    i22 = 1;
                } else {
                    i22 = i20;
                }
                int iU9 = dVar.u();
                androidx.constraintlayout.core.widgets.d dVar13 = bVar2.f36463c;
                iMax3 = Math.max(iU9, dVar13.f15975d0);
                iMax4 = Math.max(dVar.o(), dVar13.f15977e0);
                i23 = i20;
                i24 = i23;
                while (true) {
                    type = ConstraintAnchor.Type.f15937e;
                    type2 = ConstraintAnchor.Type.f15936d;
                    if (i23 < size2) {
                        break;
                        break;
                    }
                    constraintWidget2 = arrayList.get(i23);
                    int i55 = i17;
                    if (constraintWidget2 instanceof i) {
                        interfaceC0381b4 = interfaceC0381b2;
                    } else {
                        iU5 = constraintWidget2.u();
                        iO4 = constraintWidget2.o();
                        interfaceC0381b4 = interfaceC0381b2;
                        i34 = i24 | (bVar2.a(1, constraintWidget2, interfaceC0381b4) ? 1 : 0);
                        iU6 = constraintWidget2.u();
                        iO5 = constraintWidget2.o();
                        if (iU6 != iU5) {
                            constraintWidget2.S(iU6);
                            if (i21 != 0) {
                                iMax3 = Math.max(iMax3, constraintWidget2.m(type2).e() + constraintWidget2.v() + constraintWidget2.f15964W);
                            }
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        if (iO5 != iO4) {
                            constraintWidget2.P(iO5);
                            if (i22 != 0) {
                                iMax4 = Math.max(iMax4, constraintWidget2.m(type).e() + constraintWidget2.w() + constraintWidget2.f15965X);
                            }
                            i35 = 1;
                        }
                        i24 = i35 | (((i) constraintWidget2).f16143C0 ? 1 : 0);
                    }
                    i23++;
                    i17 = i55;
                    i19 = i19;
                    interfaceC0381b2 = interfaceC0381b4;
                    i18 = i18;
                }
                int i56 = i17;
                i25 = i19;
                interfaceC0381b3 = interfaceC0381b2;
                i26 = i18;
                i27 = 0;
                i28 = 2;
                while (i27 < i28) {
                    i29 = 0;
                    while (i29 < size2) {
                        constraintWidget = arrayList.get(i29);
                        if (constraintWidget instanceof p089h0.a) {
                            if (constraintWidget.f15985i0 == 8) {
                                arrayList3 = arrayList;
                                i31 = size2;
                            } else {
                                iU3 = constraintWidget.u();
                                iO2 = constraintWidget.o();
                                arrayList3 = arrayList;
                                int i57 = constraintWidget.f15973c0;
                                i31 = size2;
                                i32 = (bVar2.a(i27 == 1 ? 2 : 1, constraintWidget, interfaceC0381b3) ? 1 : 0) | i24;
                                iU4 = constraintWidget.u();
                                iO3 = constraintWidget.o();
                                if (iU4 != iU3) {
                                    constraintWidget.S(iU4);
                                    if (i21 != 0) {
                                        iMax3 = Math.max(iMax3, constraintWidget.m(type2).e() + constraintWidget.v() + constraintWidget.f15964W);
                                    }
                                    i33 = 1;
                                } else {
                                    i33 = i32;
                                }
                                if (iO3 != iO2) {
                                    constraintWidget.P(iO3);
                                    if (i22 != 0) {
                                        iMax4 = Math.max(iMax4, constraintWidget.m(type).e() + constraintWidget.w() + constraintWidget.f15965X);
                                    }
                                    i33 = 1;
                                }
                                if (constraintWidget.f15946E) {
                                    i24 = i33;
                                } else {
                                    i24 = i33;
                                }
                            }
                        } else if (constraintWidget.f15985i0 == 8) {
                            arrayList3 = arrayList;
                            i31 = size2;
                        } else {
                            iU3 = constraintWidget.u();
                            iO2 = constraintWidget.o();
                            arrayList3 = arrayList;
                            int i58 = constraintWidget.f15973c0;
                            i31 = size2;
                            i32 = (bVar2.a(i27 == 1 ? 2 : 1, constraintWidget, interfaceC0381b3) ? 1 : 0) | i24;
                            iU4 = constraintWidget.u();
                            iO3 = constraintWidget.o();
                            if (iU4 != iU3) {
                                constraintWidget.S(iU4);
                                if (i21 != 0) {
                                    iMax3 = Math.max(iMax3, constraintWidget.m(type2).e() + constraintWidget.v() + constraintWidget.f15964W);
                                }
                                i33 = 1;
                            } else {
                                i33 = i32;
                            }
                            if (iO3 != iO2) {
                                constraintWidget.P(iO3);
                                if (i22 != 0) {
                                    iMax4 = Math.max(iMax4, constraintWidget.m(type).e() + constraintWidget.w() + constraintWidget.f15965X);
                                }
                                i33 = 1;
                            }
                            if (constraintWidget.f15946E) {
                                i24 = i33;
                            } else {
                                i24 = i33;
                            }
                        }
                        i29++;
                        size2 = i31;
                        arrayList = arrayList3;
                    }
                    arrayList2 = arrayList;
                    i30 = size2;
                    if (i24 != 0) {
                        break;
                        break;
                    }
                    i27++;
                    bVar2.b(dVar, i27, i25, i26);
                    size2 = i30;
                    arrayList = arrayList2;
                    i28 = 2;
                    i24 = 0;
                }
                dVar4 = dVar;
                i17 = i56;
            }
            dVar4.f16080H0 = i17;
            androidx.constraintlayout.core.c.f15903q = dVar4.a0(512);
        }
        iMax = childCount2 == 0 ? Math.max(0, this.f16384e) : i45;
        i49 = Integer.MIN_VALUE;
        if (mode2 != i49) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    dimensionBehaviour = dimensionBehaviour7;
                    dimensionBehaviour2 = dimensionBehaviour7;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.f16387h - i47, i46);
                    dimensionBehaviour2 = dimensionBehaviour7;
                    dimensionBehaviour = dimensionBehaviour7;
                }
            } else if (childCount2 == 0) {
                dimensionBehaviour = dimensionBehaviour7;
                dimensionBehaviour2 = dimensionBehaviour;
                iMax2 = Math.max(0, this.f16385f);
            } else {
                iMax2 = 0;
            }
            iU = dVar.u();
            eVar = dVar4.f16089w0;
            if (iMax == iU) {
                eVar.f36477c = true;
            } else {
                eVar.f36477c = true;
            }
            dVar4.f15969a0 = 0;
            dVar4.f15971b0 = 0;
            int i59 = this.f16386g - i48;
            int[] iArr3 = dVar4.f15944C;
            iArr3[0] = i59;
            iArr3[1] = this.f16387h - i47;
            dVar4.f15975d0 = 0;
            dVar4.f15977e0 = 0;
            dVar4.Q(dimensionBehaviour7);
            dVar4.S(iMax);
            dVar4.R(dimensionBehaviour);
            dVar4.P(iMax2);
            i13 = this.f16384e - i48;
            if (i13 < 0) {
                dVar4.f15975d0 = 0;
            } else {
                dVar4.f15975d0 = i13;
            }
            i14 = this.f16385f - i47;
            if (i14 < 0) {
                dVar4.f15977e0 = 0;
            } else {
                dVar4.f15977e0 = i14;
            }
            dVar4.f16074B0 = iMax7;
            dVar4.f16075C0 = iMax5;
            bVar = dVar4.v0;
            bVar.getClass();
            interfaceC0381b = dVar4.f16091y0;
            size = dVar4.f35715u0.size();
            iU2 = dVar.u();
            iO = dVar.o();
            zB = g.b(i10, 128);
            if (zB) {
                z10 = true;
            } else {
                z10 = true;
            }
            dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16015d;
            if (z10) {
                i43 = 0;
                while (i43 < size) {
                    constraintWidget7 = dVar4.f35715u0.get(i43);
                    dimensionBehaviourArr2 = constraintWidget7.f15962U;
                    if (dimensionBehaviourArr2[0] == dimensionBehaviour3) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (dimensionBehaviourArr2[1] == dimensionBehaviour3) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    if (z19) {
                        z21 = false;
                    } else {
                        z21 = false;
                    }
                    if (!constraintWidget7.B()) {
                    }
                    z10 = false;
                    break;
                }
            }
            z11 = z10 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
            if (z11) {
                iMin = Math.min(dVar4.f15944C[0], i45);
                iMin2 = Math.min(dVar4.f15944C[1], i46);
                if (mode == 1073741824) {
                    if (dVar.u() != iMin) {
                        dVar4.S(iMin);
                        dVar4.f16089w0.f36476b = true;
                    }
                    i39 = 1073741824;
                } else {
                    i39 = 1073741824;
                }
                if (mode2 == i39) {
                    dVar4.P(iMin2);
                    dVar4.f16089w0.f36476b = true;
                }
                if (mode == i39) {
                    z12 = z11;
                    bVar = bVar;
                    i15 = iU2;
                    dimensionBehaviour4 = dimensionBehaviour2;
                    interfaceC0381b2 = interfaceC0381b;
                    iO = iO;
                    dimensionBehaviour5 = dimensionBehaviour7;
                    dimensionBehaviour3 = dimensionBehaviour3;
                    z14 = eVar.f36476b;
                    dVar3 = eVar.f36475a;
                    if (z14) {
                        while (r0.hasNext()) {
                            constraintWidget8.l();
                            constraintWidget8.f15968a = false;
                            androidx.constraintlayout.core.widgets.analyzer.c cVar8 = constraintWidget8.f15974d;
                            cVar8.f16045e.j = false;
                            cVar8.f16047g = false;
                            cVar8.n();
                            androidx.constraintlayout.core.widgets.analyzer.d dVar14 = constraintWidget8.f15976e;
                            dVar14.f16045e.j = false;
                            dVar14.f16047g = false;
                            dVar14.m();
                        }
                        i40 = 0;
                        dVar3.l();
                        dVar3.f15968a = false;
                        androidx.constraintlayout.core.widgets.analyzer.c cVar9 = dVar3.f15974d;
                        cVar9.f16045e.j = false;
                        cVar9.f16047g = false;
                        cVar9.n();
                        androidx.constraintlayout.core.widgets.analyzer.d dVar15 = dVar3.f15976e;
                        dVar15.f16045e.j = false;
                        dVar15.f16047g = false;
                        dVar15.m();
                        eVar.c();
                    } else {
                        i40 = 0;
                    }
                    eVar.b(eVar.f36478d);
                    dVar3.f15969a0 = i40;
                    dVar3.f15971b0 = i40;
                    dVar3.f15974d.f16048h.d(i40);
                    dVar3.f15976e.f16048h.d(i40);
                    i41 = 1073741824;
                    if (mode == 1073741824) {
                        zY = dVar4.Y(i40, zB);
                        i16 = 1;
                    } else {
                        i16 = 0;
                        zY = true;
                    }
                    if (mode2 == 1073741824) {
                        zY &= dVar4.Y(1, zB);
                        i16++;
                    }
                } else {
                    z12 = z11;
                    bVar = bVar;
                    i15 = iU2;
                    dimensionBehaviour4 = dimensionBehaviour2;
                    interfaceC0381b2 = interfaceC0381b;
                    iO = iO;
                    dimensionBehaviour5 = dimensionBehaviour7;
                    dimensionBehaviour3 = dimensionBehaviour3;
                    z14 = eVar.f36476b;
                    dVar3 = eVar.f36475a;
                    if (z14) {
                        while (r0.hasNext()) {
                            constraintWidget8.l();
                            constraintWidget8.f15968a = false;
                            androidx.constraintlayout.core.widgets.analyzer.c cVar10 = constraintWidget8.f15974d;
                            cVar10.f16045e.j = false;
                            cVar10.f16047g = false;
                            cVar10.n();
                            androidx.constraintlayout.core.widgets.analyzer.d dVar16 = constraintWidget8.f15976e;
                            dVar16.f16045e.j = false;
                            dVar16.f16047g = false;
                            dVar16.m();
                        }
                        i40 = 0;
                        dVar3.l();
                        dVar3.f15968a = false;
                        androidx.constraintlayout.core.widgets.analyzer.c cVar11 = dVar3.f15974d;
                        cVar11.f16045e.j = false;
                        cVar11.f16047g = false;
                        cVar11.n();
                        androidx.constraintlayout.core.widgets.analyzer.d dVar17 = dVar3.f15976e;
                        dVar17.f16045e.j = false;
                        dVar17.f16047g = false;
                        dVar17.m();
                        eVar.c();
                    } else {
                        i40 = 0;
                    }
                    eVar.b(eVar.f36478d);
                    dVar3.f15969a0 = i40;
                    dVar3.f15971b0 = i40;
                    dVar3.f15974d.f16048h.d(i40);
                    dVar3.f15976e.f16048h.d(i40);
                    i41 = 1073741824;
                    if (mode == 1073741824) {
                        zY = dVar4.Y(i40, zB);
                        i16 = 1;
                    } else {
                        i16 = 0;
                        zY = true;
                    }
                    if (mode2 == 1073741824) {
                        zY &= dVar4.Y(1, zB);
                        i16++;
                    }
                }
                if (zY) {
                    if (mode == i41) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (mode2 == i41) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    dVar4.T(z15, z16);
                }
            } else {
                z12 = z11;
                bVar = bVar;
                interfaceC0381b2 = interfaceC0381b;
                i15 = iU2;
                dimensionBehaviour4 = dimensionBehaviour2;
                iO = iO;
                dimensionBehaviour5 = dimensionBehaviour7;
                dimensionBehaviour3 = dimensionBehaviour3;
                i16 = 0;
                zY = false;
            }
            if (zY) {
            }
            i17 = dVar4.f16080H0;
            if (size > 0) {
                size3 = dVar4.f35715u0.size();
                boolean zA2 = dVar4.a0(64);
                interfaceC0381b5 = dVar4.f16091y0;
                i36 = 0;
                while (i36 < size3) {
                    constraintWidget6 = dVar4.f35715u0.get(i36);
                    if (!(constraintWidget6 instanceof f)) {
                        dimensionBehaviour6 = dimensionBehaviour3;
                        bVar3 = bVar;
                    } else {
                        dimensionBehaviourN = constraintWidget6.n(0);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviourN6 = constraintWidget6.n(1);
                        dimensionBehaviour6 = dimensionBehaviour3;
                        if (dimensionBehaviourN == dimensionBehaviour6) {
                            z13 = false;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                        }
                        if (z13) {
                            bVar3 = bVar;
                        } else {
                            bVar3 = bVar;
                            bVar3.a(0, constraintWidget6, interfaceC0381b5);
                        }
                    }
                    i36++;
                    bVar = bVar3;
                    dimensionBehaviour3 = dimensionBehaviour6;
                }
                bVar2 = bVar;
                constraintLayout = ((b) interfaceC0381b5).f16464a;
                childCount = constraintLayout.getChildCount();
                while (i37 < childCount) {
                    childAt = constraintLayout.getChildAt(i37);
                    if (childAt instanceof e) {
                        eVar2 = (e) childAt;
                        if (eVar2.f16622c == null) {
                            a aVar4 = (a) eVar2.getLayoutParams();
                            aVar = (a) eVar2.f16622c.getLayoutParams();
                            constraintWidget3 = aVar.f16453q0;
                            constraintWidget3.f15985i0 = 0;
                            constraintWidget4 = aVar4.f16453q0;
                            if (constraintWidget4.f15962U[0] != dimensionBehaviour5) {
                                constraintWidget4.S(constraintWidget3.u());
                            }
                            constraintWidget5 = aVar4.f16453q0;
                            if (constraintWidget5.f15962U[1] != dimensionBehaviour5) {
                                constraintWidget5.P(aVar.f16453q0.o());
                            }
                            aVar.f16453q0.f15985i0 = 8;
                        }
                    }
                }
                arrayList4 = constraintLayout.f16382c;
                size4 = arrayList4.size();
                if (size4 > 0) {
                    while (i38 < size4) {
                        arrayList4.get(i38).getClass();
                    }
                }
            } else {
                bVar2 = bVar;
            }
            bVar2.c(dVar4);
            arrayList = bVar2.f36461a;
            size2 = arrayList.size();
            if (size > 0) {
                i18 = iO;
                i19 = i15;
                i20 = 0;
                bVar2.b(dVar4, 0, i19, i18);
            } else {
                i18 = iO;
                i19 = i15;
                i20 = 0;
            }
            if (size2 > 0) {
                dimensionBehaviourArr = dVar4.f15962U;
                if (dimensionBehaviourArr[i20] == dimensionBehaviour4) {
                    i21 = 1;
                } else {
                    i21 = i20;
                }
                if (dimensionBehaviourArr[1] == dimensionBehaviour4) {
                    i22 = 1;
                } else {
                    i22 = i20;
                }
                int iU10 = dVar.u();
                androidx.constraintlayout.core.widgets.d dVar18 = bVar2.f36463c;
                iMax3 = Math.max(iU10, dVar18.f15975d0);
                iMax4 = Math.max(dVar.o(), dVar18.f15977e0);
                i23 = i20;
                i24 = i23;
                while (true) {
                    type = ConstraintAnchor.Type.f15937e;
                    type2 = ConstraintAnchor.Type.f15936d;
                    if (i23 < size2) {
                        break;
                        break;
                    }
                    constraintWidget2 = arrayList.get(i23);
                    int i510 = i17;
                    if (constraintWidget2 instanceof i) {
                        interfaceC0381b4 = interfaceC0381b2;
                    } else {
                        iU5 = constraintWidget2.u();
                        iO4 = constraintWidget2.o();
                        interfaceC0381b4 = interfaceC0381b2;
                        i34 = i24 | (bVar2.a(1, constraintWidget2, interfaceC0381b4) ? 1 : 0);
                        iU6 = constraintWidget2.u();
                        iO5 = constraintWidget2.o();
                        if (iU6 != iU5) {
                            constraintWidget2.S(iU6);
                            if (i21 != 0) {
                                iMax3 = Math.max(iMax3, constraintWidget2.m(type2).e() + constraintWidget2.v() + constraintWidget2.f15964W);
                            }
                            i35 = 1;
                        } else {
                            i35 = i34;
                        }
                        if (iO5 != iO4) {
                            constraintWidget2.P(iO5);
                            if (i22 != 0) {
                                iMax4 = Math.max(iMax4, constraintWidget2.m(type).e() + constraintWidget2.w() + constraintWidget2.f15965X);
                            }
                            i35 = 1;
                        }
                        i24 = i35 | (((i) constraintWidget2).f16143C0 ? 1 : 0);
                    }
                    i23++;
                    i17 = i510;
                    i19 = i19;
                    interfaceC0381b2 = interfaceC0381b4;
                    i18 = i18;
                }
                int i511 = i17;
                i25 = i19;
                interfaceC0381b3 = interfaceC0381b2;
                i26 = i18;
                i27 = 0;
                i28 = 2;
                while (i27 < i28) {
                    i29 = 0;
                    while (i29 < size2) {
                        constraintWidget = arrayList.get(i29);
                        if (constraintWidget instanceof p089h0.a) {
                            if (constraintWidget.f15985i0 == 8) {
                                arrayList3 = arrayList;
                                i31 = size2;
                            } else {
                                iU3 = constraintWidget.u();
                                iO2 = constraintWidget.o();
                                arrayList3 = arrayList;
                                int i512 = constraintWidget.f15973c0;
                                i31 = size2;
                                i32 = (bVar2.a(i27 == 1 ? 2 : 1, constraintWidget, interfaceC0381b3) ? 1 : 0) | i24;
                                iU4 = constraintWidget.u();
                                iO3 = constraintWidget.o();
                                if (iU4 != iU3) {
                                    constraintWidget.S(iU4);
                                    if (i21 != 0) {
                                        iMax3 = Math.max(iMax3, constraintWidget.m(type2).e() + constraintWidget.v() + constraintWidget.f15964W);
                                    }
                                    i33 = 1;
                                } else {
                                    i33 = i32;
                                }
                                if (iO3 != iO2) {
                                    constraintWidget.P(iO3);
                                    if (i22 != 0) {
                                        iMax4 = Math.max(iMax4, constraintWidget.m(type).e() + constraintWidget.w() + constraintWidget.f15965X);
                                    }
                                    i33 = 1;
                                }
                                if (constraintWidget.f15946E) {
                                    i24 = i33;
                                } else {
                                    i24 = i33;
                                }
                            }
                        } else if (constraintWidget.f15985i0 == 8) {
                            arrayList3 = arrayList;
                            i31 = size2;
                        } else {
                            iU3 = constraintWidget.u();
                            iO2 = constraintWidget.o();
                            arrayList3 = arrayList;
                            int i513 = constraintWidget.f15973c0;
                            i31 = size2;
                            i32 = (bVar2.a(i27 == 1 ? 2 : 1, constraintWidget, interfaceC0381b3) ? 1 : 0) | i24;
                            iU4 = constraintWidget.u();
                            iO3 = constraintWidget.o();
                            if (iU4 != iU3) {
                                constraintWidget.S(iU4);
                                if (i21 != 0) {
                                    iMax3 = Math.max(iMax3, constraintWidget.m(type2).e() + constraintWidget.v() + constraintWidget.f15964W);
                                }
                                i33 = 1;
                            } else {
                                i33 = i32;
                            }
                            if (iO3 != iO2) {
                                constraintWidget.P(iO3);
                                if (i22 != 0) {
                                    iMax4 = Math.max(iMax4, constraintWidget.m(type).e() + constraintWidget.w() + constraintWidget.f15965X);
                                }
                                i33 = 1;
                            }
                            if (constraintWidget.f15946E) {
                                i24 = i33;
                            } else {
                                i24 = i33;
                            }
                        }
                        i29++;
                        size2 = i31;
                        arrayList = arrayList3;
                    }
                    arrayList2 = arrayList;
                    i30 = size2;
                    if (i24 != 0) {
                        break;
                        break;
                    }
                    i27++;
                    bVar2.b(dVar, i27, i25, i26);
                    size2 = i30;
                    arrayList = arrayList2;
                    i28 = 2;
                    i24 = 0;
                }
                dVar4 = dVar;
                i17 = i511;
            }
            dVar4.f16080H0 = i17;
            androidx.constraintlayout.core.c.f15903q = dVar4.a0(512);
        }
        if (childCount2 == 0) {
            iMax2 = Math.max(0, this.f16385f);
        } else {
            iMax2 = i46;
        }
        dimensionBehaviour = dimensionBehaviour7;
        dimensionBehaviour2 = dimensionBehaviour;
        iU = dVar.u();
        eVar = dVar4.f16089w0;
        if (iMax == iU) {
            eVar.f36477c = true;
        } else {
            eVar.f36477c = true;
        }
        dVar4.f15969a0 = 0;
        dVar4.f15971b0 = 0;
        int i514 = this.f16386g - i48;
        int[] iArr4 = dVar4.f15944C;
        iArr4[0] = i514;
        iArr4[1] = this.f16387h - i47;
        dVar4.f15975d0 = 0;
        dVar4.f15977e0 = 0;
        dVar4.Q(dimensionBehaviour7);
        dVar4.S(iMax);
        dVar4.R(dimensionBehaviour);
        dVar4.P(iMax2);
        i13 = this.f16384e - i48;
        if (i13 < 0) {
            dVar4.f15975d0 = 0;
        } else {
            dVar4.f15975d0 = i13;
        }
        i14 = this.f16385f - i47;
        if (i14 < 0) {
            dVar4.f15977e0 = 0;
        } else {
            dVar4.f15977e0 = i14;
        }
        dVar4.f16074B0 = iMax7;
        dVar4.f16075C0 = iMax5;
        bVar = dVar4.v0;
        bVar.getClass();
        interfaceC0381b = dVar4.f16091y0;
        size = dVar4.f35715u0.size();
        iU2 = dVar.u();
        iO = dVar.o();
        zB = g.b(i10, 128);
        if (zB) {
            z10 = true;
        } else {
            z10 = true;
        }
        dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.f16015d;
        if (z10) {
            i43 = 0;
            while (i43 < size) {
                constraintWidget7 = dVar4.f35715u0.get(i43);
                dimensionBehaviourArr2 = constraintWidget7.f15962U;
                if (dimensionBehaviourArr2[0] == dimensionBehaviour3) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (dimensionBehaviourArr2[1] == dimensionBehaviour3) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                if (z19) {
                    z21 = false;
                } else {
                    z21 = false;
                }
                if (!constraintWidget7.B()) {
                }
                z10 = false;
                break;
            }
        }
        z11 = z10 & ((mode != 1073741824 && mode2 == 1073741824) || zB);
        if (z11) {
            iMin = Math.min(dVar4.f15944C[0], i45);
            iMin2 = Math.min(dVar4.f15944C[1], i46);
            if (mode == 1073741824) {
                if (dVar.u() != iMin) {
                    dVar4.S(iMin);
                    dVar4.f16089w0.f36476b = true;
                }
                i39 = 1073741824;
            } else {
                i39 = 1073741824;
            }
            if (mode2 == i39) {
                dVar4.P(iMin2);
                dVar4.f16089w0.f36476b = true;
            }
            if (mode == i39) {
                z12 = z11;
                bVar = bVar;
                i15 = iU2;
                dimensionBehaviour4 = dimensionBehaviour2;
                interfaceC0381b2 = interfaceC0381b;
                iO = iO;
                dimensionBehaviour5 = dimensionBehaviour7;
                dimensionBehaviour3 = dimensionBehaviour3;
                z14 = eVar.f36476b;
                dVar3 = eVar.f36475a;
                if (z14) {
                    while (r0.hasNext()) {
                        constraintWidget8.l();
                        constraintWidget8.f15968a = false;
                        androidx.constraintlayout.core.widgets.analyzer.c cVar12 = constraintWidget8.f15974d;
                        cVar12.f16045e.j = false;
                        cVar12.f16047g = false;
                        cVar12.n();
                        androidx.constraintlayout.core.widgets.analyzer.d dVar19 = constraintWidget8.f15976e;
                        dVar19.f16045e.j = false;
                        dVar19.f16047g = false;
                        dVar19.m();
                    }
                    i40 = 0;
                    dVar3.l();
                    dVar3.f15968a = false;
                    androidx.constraintlayout.core.widgets.analyzer.c cVar13 = dVar3.f15974d;
                    cVar13.f16045e.j = false;
                    cVar13.f16047g = false;
                    cVar13.n();
                    androidx.constraintlayout.core.widgets.analyzer.d dVar110 = dVar3.f15976e;
                    dVar110.f16045e.j = false;
                    dVar110.f16047g = false;
                    dVar110.m();
                    eVar.c();
                } else {
                    i40 = 0;
                }
                eVar.b(eVar.f36478d);
                dVar3.f15969a0 = i40;
                dVar3.f15971b0 = i40;
                dVar3.f15974d.f16048h.d(i40);
                dVar3.f15976e.f16048h.d(i40);
                i41 = 1073741824;
                if (mode == 1073741824) {
                    zY = dVar4.Y(i40, zB);
                    i16 = 1;
                } else {
                    i16 = 0;
                    zY = true;
                }
                if (mode2 == 1073741824) {
                    zY &= dVar4.Y(1, zB);
                    i16++;
                }
            } else {
                z12 = z11;
                bVar = bVar;
                i15 = iU2;
                dimensionBehaviour4 = dimensionBehaviour2;
                interfaceC0381b2 = interfaceC0381b;
                iO = iO;
                dimensionBehaviour5 = dimensionBehaviour7;
                dimensionBehaviour3 = dimensionBehaviour3;
                z14 = eVar.f36476b;
                dVar3 = eVar.f36475a;
                if (z14) {
                    while (r0.hasNext()) {
                        constraintWidget8.l();
                        constraintWidget8.f15968a = false;
                        androidx.constraintlayout.core.widgets.analyzer.c cVar14 = constraintWidget8.f15974d;
                        cVar14.f16045e.j = false;
                        cVar14.f16047g = false;
                        cVar14.n();
                        androidx.constraintlayout.core.widgets.analyzer.d dVar111 = constraintWidget8.f15976e;
                        dVar111.f16045e.j = false;
                        dVar111.f16047g = false;
                        dVar111.m();
                    }
                    i40 = 0;
                    dVar3.l();
                    dVar3.f15968a = false;
                    androidx.constraintlayout.core.widgets.analyzer.c cVar15 = dVar3.f15974d;
                    cVar15.f16045e.j = false;
                    cVar15.f16047g = false;
                    cVar15.n();
                    androidx.constraintlayout.core.widgets.analyzer.d dVar112 = dVar3.f15976e;
                    dVar112.f16045e.j = false;
                    dVar112.f16047g = false;
                    dVar112.m();
                    eVar.c();
                } else {
                    i40 = 0;
                }
                eVar.b(eVar.f36478d);
                dVar3.f15969a0 = i40;
                dVar3.f15971b0 = i40;
                dVar3.f15974d.f16048h.d(i40);
                dVar3.f15976e.f16048h.d(i40);
                i41 = 1073741824;
                if (mode == 1073741824) {
                    zY = dVar4.Y(i40, zB);
                    i16 = 1;
                } else {
                    i16 = 0;
                    zY = true;
                }
                if (mode2 == 1073741824) {
                    zY &= dVar4.Y(1, zB);
                    i16++;
                }
            }
            if (zY) {
                if (mode == i41) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (mode2 == i41) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                dVar4.T(z15, z16);
            }
        } else {
            z12 = z11;
            bVar = bVar;
            interfaceC0381b2 = interfaceC0381b;
            i15 = iU2;
            dimensionBehaviour4 = dimensionBehaviour2;
            iO = iO;
            dimensionBehaviour5 = dimensionBehaviour7;
            dimensionBehaviour3 = dimensionBehaviour3;
            i16 = 0;
            zY = false;
        }
        if (zY) {
        }
        i17 = dVar4.f16080H0;
        if (size > 0) {
            size3 = dVar4.f35715u0.size();
            boolean zA3 = dVar4.a0(64);
            interfaceC0381b5 = dVar4.f16091y0;
            i36 = 0;
            while (i36 < size3) {
                constraintWidget6 = dVar4.f35715u0.get(i36);
                if (!(constraintWidget6 instanceof f)) {
                    dimensionBehaviour6 = dimensionBehaviour3;
                    bVar3 = bVar;
                } else {
                    dimensionBehaviourN = constraintWidget6.n(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourN7 = constraintWidget6.n(1);
                    dimensionBehaviour6 = dimensionBehaviour3;
                    if (dimensionBehaviourN == dimensionBehaviour6) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                    }
                    if (z13) {
                        bVar3 = bVar;
                    } else {
                        bVar3 = bVar;
                        bVar3.a(0, constraintWidget6, interfaceC0381b5);
                    }
                }
                i36++;
                bVar = bVar3;
                dimensionBehaviour3 = dimensionBehaviour6;
            }
            bVar2 = bVar;
            constraintLayout = ((b) interfaceC0381b5).f16464a;
            childCount = constraintLayout.getChildCount();
            while (i37 < childCount) {
                childAt = constraintLayout.getChildAt(i37);
                if (childAt instanceof e) {
                    eVar2 = (e) childAt;
                    if (eVar2.f16622c == null) {
                        a aVar5 = (a) eVar2.getLayoutParams();
                        aVar = (a) eVar2.f16622c.getLayoutParams();
                        constraintWidget3 = aVar.f16453q0;
                        constraintWidget3.f15985i0 = 0;
                        constraintWidget4 = aVar5.f16453q0;
                        if (constraintWidget4.f15962U[0] != dimensionBehaviour5) {
                            constraintWidget4.S(constraintWidget3.u());
                        }
                        constraintWidget5 = aVar5.f16453q0;
                        if (constraintWidget5.f15962U[1] != dimensionBehaviour5) {
                            constraintWidget5.P(aVar.f16453q0.o());
                        }
                        aVar.f16453q0.f15985i0 = 8;
                    }
                }
            }
            arrayList4 = constraintLayout.f16382c;
            size4 = arrayList4.size();
            if (size4 > 0) {
                while (i38 < size4) {
                    arrayList4.get(i38).getClass();
                }
            }
        } else {
            bVar2 = bVar;
        }
        bVar2.c(dVar4);
        arrayList = bVar2.f36461a;
        size2 = arrayList.size();
        if (size > 0) {
            i18 = iO;
            i19 = i15;
            i20 = 0;
            bVar2.b(dVar4, 0, i19, i18);
        } else {
            i18 = iO;
            i19 = i15;
            i20 = 0;
        }
        if (size2 > 0) {
            dimensionBehaviourArr = dVar4.f15962U;
            if (dimensionBehaviourArr[i20] == dimensionBehaviour4) {
                i21 = 1;
            } else {
                i21 = i20;
            }
            if (dimensionBehaviourArr[1] == dimensionBehaviour4) {
                i22 = 1;
            } else {
                i22 = i20;
            }
            int iU11 = dVar.u();
            androidx.constraintlayout.core.widgets.d dVar113 = bVar2.f36463c;
            iMax3 = Math.max(iU11, dVar113.f15975d0);
            iMax4 = Math.max(dVar.o(), dVar113.f15977e0);
            i23 = i20;
            i24 = i23;
            while (true) {
                type = ConstraintAnchor.Type.f15937e;
                type2 = ConstraintAnchor.Type.f15936d;
                if (i23 < size2) {
                    break;
                    break;
                }
                constraintWidget2 = arrayList.get(i23);
                int i515 = i17;
                if (constraintWidget2 instanceof i) {
                    interfaceC0381b4 = interfaceC0381b2;
                } else {
                    iU5 = constraintWidget2.u();
                    iO4 = constraintWidget2.o();
                    interfaceC0381b4 = interfaceC0381b2;
                    i34 = i24 | (bVar2.a(1, constraintWidget2, interfaceC0381b4) ? 1 : 0);
                    iU6 = constraintWidget2.u();
                    iO5 = constraintWidget2.o();
                    if (iU6 != iU5) {
                        constraintWidget2.S(iU6);
                        if (i21 != 0) {
                            iMax3 = Math.max(iMax3, constraintWidget2.m(type2).e() + constraintWidget2.v() + constraintWidget2.f15964W);
                        }
                        i35 = 1;
                    } else {
                        i35 = i34;
                    }
                    if (iO5 != iO4) {
                        constraintWidget2.P(iO5);
                        if (i22 != 0) {
                            iMax4 = Math.max(iMax4, constraintWidget2.m(type).e() + constraintWidget2.w() + constraintWidget2.f15965X);
                        }
                        i35 = 1;
                    }
                    i24 = i35 | (((i) constraintWidget2).f16143C0 ? 1 : 0);
                }
                i23++;
                i17 = i515;
                i19 = i19;
                interfaceC0381b2 = interfaceC0381b4;
                i18 = i18;
            }
            int i516 = i17;
            i25 = i19;
            interfaceC0381b3 = interfaceC0381b2;
            i26 = i18;
            i27 = 0;
            i28 = 2;
            while (i27 < i28) {
                i29 = 0;
                while (i29 < size2) {
                    constraintWidget = arrayList.get(i29);
                    if (constraintWidget instanceof p089h0.a) {
                        if (constraintWidget.f15985i0 == 8) {
                            arrayList3 = arrayList;
                            i31 = size2;
                        } else {
                            iU3 = constraintWidget.u();
                            iO2 = constraintWidget.o();
                            arrayList3 = arrayList;
                            int i517 = constraintWidget.f15973c0;
                            i31 = size2;
                            i32 = (bVar2.a(i27 == 1 ? 2 : 1, constraintWidget, interfaceC0381b3) ? 1 : 0) | i24;
                            iU4 = constraintWidget.u();
                            iO3 = constraintWidget.o();
                            if (iU4 != iU3) {
                                constraintWidget.S(iU4);
                                if (i21 != 0) {
                                    iMax3 = Math.max(iMax3, constraintWidget.m(type2).e() + constraintWidget.v() + constraintWidget.f15964W);
                                }
                                i33 = 1;
                            } else {
                                i33 = i32;
                            }
                            if (iO3 != iO2) {
                                constraintWidget.P(iO3);
                                if (i22 != 0) {
                                    iMax4 = Math.max(iMax4, constraintWidget.m(type).e() + constraintWidget.w() + constraintWidget.f15965X);
                                }
                                i33 = 1;
                            }
                            if (constraintWidget.f15946E) {
                                i24 = i33;
                            } else {
                                i24 = i33;
                            }
                        }
                    } else if (constraintWidget.f15985i0 == 8) {
                        arrayList3 = arrayList;
                        i31 = size2;
                    } else {
                        iU3 = constraintWidget.u();
                        iO2 = constraintWidget.o();
                        arrayList3 = arrayList;
                        int i518 = constraintWidget.f15973c0;
                        i31 = size2;
                        i32 = (bVar2.a(i27 == 1 ? 2 : 1, constraintWidget, interfaceC0381b3) ? 1 : 0) | i24;
                        iU4 = constraintWidget.u();
                        iO3 = constraintWidget.o();
                        if (iU4 != iU3) {
                            constraintWidget.S(iU4);
                            if (i21 != 0) {
                                iMax3 = Math.max(iMax3, constraintWidget.m(type2).e() + constraintWidget.v() + constraintWidget.f15964W);
                            }
                            i33 = 1;
                        } else {
                            i33 = i32;
                        }
                        if (iO3 != iO2) {
                            constraintWidget.P(iO3);
                            if (i22 != 0) {
                                iMax4 = Math.max(iMax4, constraintWidget.m(type).e() + constraintWidget.w() + constraintWidget.f15965X);
                            }
                            i33 = 1;
                        }
                        if (constraintWidget.f15946E) {
                            i24 = i33;
                        } else {
                            i24 = i33;
                        }
                    }
                    i29++;
                    size2 = i31;
                    arrayList = arrayList3;
                }
                arrayList2 = arrayList;
                i30 = size2;
                if (i24 != 0) {
                    break;
                    break;
                }
                i27++;
                bVar2.b(dVar, i27, i25, i26);
                size2 = i30;
                arrayList = arrayList2;
                i28 = 2;
                i24 = 0;
            }
            dVar4 = dVar;
            i17 = i516;
        }
        dVar4.f16080H0 = i17;
        androidx.constraintlayout.core.c.f15903q = dVar4.a0(512);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            a aVar = (a) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = aVar.f16453q0;
            if ((childAt.getVisibility() != 8 || aVar.f16428d0 || aVar.f16430e0 || zIsInEditMode) && !aVar.f16432f0) {
                int iV = constraintWidget.v();
                int iW = constraintWidget.w();
                int iU = constraintWidget.u() + iV;
                int iO = constraintWidget.o() + iW;
                childAt.layout(iV, iW, iU, iO);
                if ((childAt instanceof e) && (content = ((e) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iV, iW, iU, iO);
                }
            }
        }
        ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f16382c;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.get(i15).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01bc  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        ConstraintWidget constraintWidget;
        boolean z11 = this.f16388i;
        this.f16388i = z11;
        int i12 = 0;
        if (!z11) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).isLayoutRequested()) {
                    this.f16388i = true;
                    break;
                }
            }
        }
        boolean zF = f();
        androidx.constraintlayout.core.widgets.d dVar = this.f16383d;
        dVar.f16092z0 = zF;
        if (this.f16388i) {
            this.f16388i = false;
            int childCount2 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount2) {
                    z10 = false;
                    break;
                } else {
                    if (getChildAt(i14).isLayoutRequested()) {
                        z10 = true;
                        break;
                    }
                    i14++;
                }
            }
            if (z10) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    ConstraintWidget constraintWidgetD = d(getChildAt(i15));
                    if (constraintWidgetD != null) {
                        constraintWidgetD.G();
                    }
                }
                if (zIsInEditMode) {
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt = getChildAt(i16);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.f16392n == null) {
                                    this.f16392n = new HashMap<>();
                                }
                                int iIndexOf = resourceName.indexOf("/");
                                this.f16392n.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = this.f16381b.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                constraintWidget = viewFindViewById == this ? dVar : viewFindViewById == null ? null : ((a) viewFindViewById.getLayoutParams()).f16453q0;
                            }
                            constraintWidget.f15988k0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.f16391m != -1) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = getChildAt(i17);
                        if (childAt2.getId() == this.f16391m && (childAt2 instanceof c)) {
                            this.f16389k = ((c) childAt2).getConstraintSet();
                        }
                    }
                }
                androidx.constraintlayout.widget.b bVar = this.f16389k;
                if (bVar != null) {
                    bVar.c(this);
                }
                dVar.f35715u0.clear();
                ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f16382c;
                int size = arrayList.size();
                if (size > 0) {
                    int i18 = 0;
                    while (i18 < size) {
                        androidx.constraintlayout.widget.a aVar = arrayList.get(i18);
                        if (aVar.isInEditMode()) {
                            aVar.setIds(aVar.f16476f);
                        }
                        p089h0.b bVar2 = aVar.f16475e;
                        if (bVar2 != null) {
                            bVar2.a();
                            for (int i19 = i12; i19 < aVar.f16473c; i19++) {
                                int i20 = aVar.f16472b[i19];
                                View viewC = c(i20);
                                if (viewC == null) {
                                    Integer numValueOf2 = Integer.valueOf(i20);
                                    HashMap<Integer, String> map = aVar.f16479i;
                                    String str = map.get(numValueOf2);
                                    int iF = aVar.f(this, str);
                                    if (iF != 0) {
                                        aVar.f16472b[i19] = iF;
                                        map.put(Integer.valueOf(iF), str);
                                        viewC = c(iF);
                                    }
                                }
                                if (viewC != null) {
                                    aVar.f16475e.b(d(viewC));
                                }
                            }
                            aVar.f16475e.c();
                        }
                        i18++;
                        i12 = 0;
                    }
                }
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt3 = getChildAt(i21);
                    if (childAt3 instanceof e) {
                        e eVar = (e) childAt3;
                        if (eVar.f16621b == -1 && !eVar.isInEditMode()) {
                            eVar.setVisibility(eVar.f16623d);
                        }
                        View viewFindViewById2 = findViewById(eVar.f16621b);
                        eVar.f16622c = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((a) viewFindViewById2.getLayoutParams()).f16432f0 = true;
                            eVar.f16622c.setVisibility(0);
                            eVar.setVisibility(0);
                        }
                    }
                }
                SparseArray<ConstraintWidget> sparseArray = this.f16393o;
                sparseArray.clear();
                sparseArray.put(0, dVar);
                sparseArray.put(getId(), dVar);
                for (int i22 = 0; i22 < childCount3; i22++) {
                    View childAt4 = getChildAt(i22);
                    sparseArray.put(childAt4.getId(), d(childAt4));
                }
                for (int i23 = 0; i23 < childCount3; i23++) {
                    View childAt5 = getChildAt(i23);
                    ConstraintWidget constraintWidgetD2 = d(childAt5);
                    if (constraintWidgetD2 != null) {
                        a aVar2 = (a) childAt5.getLayoutParams();
                        dVar.f35715u0.add(constraintWidgetD2);
                        ConstraintWidget constraintWidget2 = constraintWidgetD2.f15963V;
                        if (constraintWidget2 != null) {
                            ((p089h0.c) constraintWidget2).f35715u0.remove(constraintWidgetD2);
                            constraintWidgetD2.G();
                        }
                        constraintWidgetD2.f15963V = dVar;
                        b(zIsInEditMode, childAt5, constraintWidgetD2, aVar2, sparseArray);
                    }
                }
            }
            if (z10) {
                dVar.v0.c(dVar);
            }
        }
        dVar.f16073A0.getClass();
        i(dVar, this.j, i10, i11);
        h(i10, i11, dVar.u(), dVar.o(), dVar.f16081I0, dVar.f16082J0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget constraintWidgetD = d(view);
        if ((view instanceof d) && !(constraintWidgetD instanceof f)) {
            a aVar = (a) view.getLayoutParams();
            f fVar = new f();
            aVar.f16453q0 = fVar;
            aVar.f16428d0 = true;
            fVar.W(aVar.f16416V);
        }
        if (view instanceof androidx.constraintlayout.widget.a) {
            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) view;
            aVar2.k();
            ((a) view.getLayoutParams()).f16430e0 = true;
            ArrayList<androidx.constraintlayout.widget.a> arrayList = this.f16382c;
            if (!arrayList.contains(aVar2)) {
                arrayList.add(aVar2);
            }
        }
        this.f16381b.put(view.getId(), view);
        this.f16388i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f16381b.remove(view.getId());
        ConstraintWidget constraintWidgetD = d(view);
        this.f16383d.f35715u0.remove(constraintWidgetD);
        constraintWidgetD.G();
        this.f16382c.remove(view);
        this.f16388i = true;
    }

    public final void p(ConstraintWidget constraintWidget, a aVar, SparseArray<ConstraintWidget> sparseArray, int i10, ConstraintAnchor.Type type) {
        View view = this.f16381b.get(i10);
        ConstraintWidget constraintWidget2 = sparseArray.get(i10);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof a)) {
            return;
        }
        aVar.f16426c0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.f15938f;
        if (type == type2) {
            a aVar2 = (a) view.getLayoutParams();
            aVar2.f16426c0 = true;
            aVar2.f16453q0.f15946E = true;
        }
        constraintWidget.m(type2).b(constraintWidget2.m(type), aVar.f16398D, aVar.f16397C, true);
        constraintWidget.f15946E = true;
        constraintWidget.m(ConstraintAnchor.Type.f15935c).j();
        constraintWidget.m(ConstraintAnchor.Type.f15937e).j();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f16388i = true;
        super.requestLayout();
    }

    public void setConstraintSet(androidx.constraintlayout.widget.b bVar) {
        this.f16389k = bVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id = getId();
        SparseArray<View> sparseArray = this.f16381b;
        sparseArray.remove(id);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f16387h) {
            return;
        }
        this.f16387h = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f16386g) {
            return;
        }
        this.f16386g = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f16385f) {
            return;
        }
        this.f16385f = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f16384e) {
            return;
        }
        this.f16384e = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(p139l0.b bVar) {
        p139l0.a aVar = this.f16390l;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.j = i10;
        androidx.constraintlayout.core.widgets.d dVar = this.f16383d;
        dVar.f16080H0 = i10;
        androidx.constraintlayout.core.c.f15903q = dVar.a0(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16381b = new SparseArray<>();
        this.f16382c = new ArrayList<>(4);
        this.f16383d = new androidx.constraintlayout.core.widgets.d();
        this.f16384e = 0;
        this.f16385f = 0;
        this.f16386g = BrazeLogger.SUPPRESS;
        this.f16387h = BrazeLogger.SUPPRESS;
        this.f16388i = true;
        this.j = 257;
        this.f16389k = null;
        this.f16390l = null;
        this.f16391m = -1;
        this.f16392n = new HashMap<>();
        this.f16393o = new SparseArray<>();
        this.f16394p = new b(this);
        e(attributeSet, i10);
    }

    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f16395A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f16396B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public final int f16397C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public final int f16398D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f16399E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f16400F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public String f16401G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public float f16402H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public float f16403I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f16404J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f16405K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f16406L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f16407M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f16408N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f16409O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public int f16410P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f16411Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public float f16412R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public float f16413S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f16414T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f16415U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public int f16416V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public boolean f16417W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public boolean f16418X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public String f16419Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public int f16420Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16421a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public boolean f16422a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16423b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public boolean f16424b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f16425c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public boolean f16426c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f16427d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public boolean f16428d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16429e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public boolean f16430e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16431f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public boolean f16432f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16433g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public int f16434g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f16435h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public int f16436h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16437i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public int f16438i0;
        public int j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public int f16439j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f16440k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        public int f16441k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f16442l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        public int f16443l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f16444m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public float f16445m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f16446n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public int f16447n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f16448o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public int f16449o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f16450p;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public float f16451p0;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f16452q;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public ConstraintWidget f16453q0;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f16454r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f16455s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f16456t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f16457u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f16458v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final int f16459w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f16460x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final int f16461y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f16462z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a, reason: collision with other inner class name */
        public static class C0168a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f16463a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f16463a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItem, 49);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 21);
                sparseIntArray.append(R.styleable.AppCompatTheme_textColorSearchUrl, 22);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 23);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 24);
                sparseIntArray.append(R.styleable.AppCompatTheme_textColorAlertDialogListItem, 25);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(R.styleable.AppCompatTheme_switchStyle, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(R.styleable.AppCompatTheme_tooltipForegroundColor, 66);
            }
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f16421a = -1;
            this.f16423b = -1;
            this.f16425c = -1.0f;
            this.f16427d = true;
            this.f16429e = -1;
            this.f16431f = -1;
            this.f16433g = -1;
            this.f16435h = -1;
            this.f16437i = -1;
            this.j = -1;
            this.f16440k = -1;
            this.f16442l = -1;
            this.f16444m = -1;
            this.f16446n = -1;
            this.f16448o = -1;
            this.f16450p = -1;
            this.f16452q = 0;
            this.f16454r = 0.0f;
            this.f16455s = -1;
            this.f16456t = -1;
            this.f16457u = -1;
            this.f16458v = -1;
            this.f16459w = Integer.MIN_VALUE;
            this.f16460x = Integer.MIN_VALUE;
            this.f16461y = Integer.MIN_VALUE;
            this.f16462z = Integer.MIN_VALUE;
            this.f16395A = Integer.MIN_VALUE;
            this.f16396B = Integer.MIN_VALUE;
            this.f16397C = Integer.MIN_VALUE;
            this.f16398D = 0;
            this.f16399E = 0.5f;
            this.f16400F = 0.5f;
            this.f16401G = null;
            this.f16402H = -1.0f;
            this.f16403I = -1.0f;
            this.f16404J = 0;
            this.f16405K = 0;
            this.f16406L = 0;
            this.f16407M = 0;
            this.f16408N = 0;
            this.f16409O = 0;
            this.f16410P = 0;
            this.f16411Q = 0;
            this.f16412R = 1.0f;
            this.f16413S = 1.0f;
            this.f16414T = -1;
            this.f16415U = -1;
            this.f16416V = -1;
            this.f16417W = false;
            this.f16418X = false;
            this.f16419Y = null;
            this.f16420Z = 0;
            this.f16422a0 = true;
            this.f16424b0 = true;
            this.f16426c0 = false;
            this.f16428d0 = false;
            this.f16430e0 = false;
            this.f16432f0 = false;
            this.f16434g0 = -1;
            this.f16436h0 = -1;
            this.f16438i0 = -1;
            this.f16439j0 = -1;
            this.f16441k0 = Integer.MIN_VALUE;
            this.f16443l0 = Integer.MIN_VALUE;
            this.f16445m0 = 0.5f;
            this.f16453q0 = new ConstraintWidget();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
                ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
                ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
                ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
                setMarginStart(marginLayoutParams.getMarginStart());
                setMarginEnd(marginLayoutParams.getMarginEnd());
            }
            if (layoutParams instanceof a) {
                a aVar = (a) layoutParams;
                this.f16421a = aVar.f16421a;
                this.f16423b = aVar.f16423b;
                this.f16425c = aVar.f16425c;
                this.f16427d = aVar.f16427d;
                this.f16429e = aVar.f16429e;
                this.f16431f = aVar.f16431f;
                this.f16433g = aVar.f16433g;
                this.f16435h = aVar.f16435h;
                this.f16437i = aVar.f16437i;
                this.j = aVar.j;
                this.f16440k = aVar.f16440k;
                this.f16442l = aVar.f16442l;
                this.f16444m = aVar.f16444m;
                this.f16446n = aVar.f16446n;
                this.f16448o = aVar.f16448o;
                this.f16450p = aVar.f16450p;
                this.f16452q = aVar.f16452q;
                this.f16454r = aVar.f16454r;
                this.f16455s = aVar.f16455s;
                this.f16456t = aVar.f16456t;
                this.f16457u = aVar.f16457u;
                this.f16458v = aVar.f16458v;
                this.f16459w = aVar.f16459w;
                this.f16460x = aVar.f16460x;
                this.f16461y = aVar.f16461y;
                this.f16462z = aVar.f16462z;
                this.f16395A = aVar.f16395A;
                this.f16396B = aVar.f16396B;
                this.f16397C = aVar.f16397C;
                this.f16398D = aVar.f16398D;
                this.f16399E = aVar.f16399E;
                this.f16400F = aVar.f16400F;
                this.f16401G = aVar.f16401G;
                this.f16402H = aVar.f16402H;
                this.f16403I = aVar.f16403I;
                this.f16404J = aVar.f16404J;
                this.f16405K = aVar.f16405K;
                this.f16417W = aVar.f16417W;
                this.f16418X = aVar.f16418X;
                this.f16406L = aVar.f16406L;
                this.f16407M = aVar.f16407M;
                this.f16408N = aVar.f16408N;
                this.f16410P = aVar.f16410P;
                this.f16409O = aVar.f16409O;
                this.f16411Q = aVar.f16411Q;
                this.f16412R = aVar.f16412R;
                this.f16413S = aVar.f16413S;
                this.f16414T = aVar.f16414T;
                this.f16415U = aVar.f16415U;
                this.f16416V = aVar.f16416V;
                this.f16422a0 = aVar.f16422a0;
                this.f16424b0 = aVar.f16424b0;
                this.f16426c0 = aVar.f16426c0;
                this.f16428d0 = aVar.f16428d0;
                this.f16434g0 = aVar.f16434g0;
                this.f16436h0 = aVar.f16436h0;
                this.f16438i0 = aVar.f16438i0;
                this.f16439j0 = aVar.f16439j0;
                this.f16441k0 = aVar.f16441k0;
                this.f16443l0 = aVar.f16443l0;
                this.f16445m0 = aVar.f16445m0;
                this.f16419Y = aVar.f16419Y;
                this.f16420Z = aVar.f16420Z;
                this.f16453q0 = aVar.f16453q0;
            }
        }

        public final void a() {
            this.f16428d0 = false;
            this.f16422a0 = true;
            this.f16424b0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f16417W) {
                this.f16422a0 = false;
                if (this.f16406L == 0) {
                    this.f16406L = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f16418X) {
                this.f16424b0 = false;
                if (this.f16407M == 0) {
                    this.f16407M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f16422a0 = false;
                if (i10 == 0 && this.f16406L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f16417W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f16424b0 = false;
                if (i11 == 0 && this.f16407M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f16418X = true;
                }
            }
            if (this.f16425c == -1.0f && this.f16421a == -1 && this.f16423b == -1) {
                return;
            }
            this.f16428d0 = true;
            this.f16422a0 = true;
            this.f16424b0 = true;
            if (!(this.f16453q0 instanceof f)) {
                this.f16453q0 = new f();
            }
            ((f) this.f16453q0).W(this.f16416V);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0051  */
        /* JADX WARN: Code duplicated, block: B:23:0x0058  */
        /* JADX WARN: Code duplicated, block: B:26:0x005e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0064  */
        /* JADX WARN: Code duplicated, block: B:38:0x007a  */
        /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0084  */
        /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x008d  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public final void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f16438i0 = -1;
            this.f16439j0 = -1;
            this.f16434g0 = -1;
            this.f16436h0 = -1;
            this.f16441k0 = this.f16459w;
            this.f16443l0 = this.f16461y;
            float f10 = this.f16399E;
            this.f16445m0 = f10;
            int i17 = this.f16421a;
            this.f16447n0 = i17;
            int i18 = this.f16423b;
            this.f16449o0 = i18;
            float f11 = this.f16425c;
            this.f16451p0 = f11;
            if (z11) {
                int i19 = this.f16455s;
                if (i19 != -1) {
                    this.f16438i0 = i19;
                } else {
                    int i20 = this.f16456t;
                    if (i20 != -1) {
                        this.f16439j0 = i20;
                    } else {
                        i11 = this.f16457u;
                        if (i11 != -1) {
                            this.f16436h0 = i11;
                            z10 = true;
                        }
                        i12 = this.f16458v;
                        if (i12 != -1) {
                            this.f16434g0 = i12;
                            z10 = true;
                        }
                        i13 = this.f16395A;
                        if (i13 != Integer.MIN_VALUE) {
                            this.f16443l0 = i13;
                        }
                        i14 = this.f16396B;
                        if (i14 != Integer.MIN_VALUE) {
                            this.f16441k0 = i14;
                        }
                        if (z10) {
                            this.f16445m0 = 1.0f - f10;
                        }
                        if (this.f16428d0 && this.f16416V == 1 && this.f16427d) {
                            if (f11 != -1.0f) {
                                this.f16451p0 = 1.0f - f11;
                                this.f16447n0 = -1;
                                this.f16449o0 = -1;
                            } else if (i17 != -1) {
                                this.f16449o0 = i17;
                                this.f16447n0 = -1;
                                this.f16451p0 = -1.0f;
                            } else if (i18 != -1) {
                                this.f16447n0 = i18;
                                this.f16449o0 = -1;
                                this.f16451p0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i11 = this.f16457u;
                if (i11 != -1) {
                    this.f16436h0 = i11;
                    z10 = true;
                }
                i12 = this.f16458v;
                if (i12 != -1) {
                    this.f16434g0 = i12;
                    z10 = true;
                }
                i13 = this.f16395A;
                if (i13 != Integer.MIN_VALUE) {
                    this.f16443l0 = i13;
                }
                i14 = this.f16396B;
                if (i14 != Integer.MIN_VALUE) {
                    this.f16441k0 = i14;
                }
                if (z10) {
                    this.f16445m0 = 1.0f - f10;
                }
                if (this.f16428d0) {
                    if (f11 != -1.0f) {
                        this.f16451p0 = 1.0f - f11;
                        this.f16447n0 = -1;
                        this.f16449o0 = -1;
                    } else if (i17 != -1) {
                        this.f16449o0 = i17;
                        this.f16447n0 = -1;
                        this.f16451p0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f16447n0 = i18;
                        this.f16449o0 = -1;
                        this.f16451p0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f16455s;
                if (i21 != -1) {
                    this.f16436h0 = i21;
                }
                int i22 = this.f16456t;
                if (i22 != -1) {
                    this.f16434g0 = i22;
                }
                int i23 = this.f16457u;
                if (i23 != -1) {
                    this.f16438i0 = i23;
                }
                int i24 = this.f16458v;
                if (i24 != -1) {
                    this.f16439j0 = i24;
                }
                int i25 = this.f16395A;
                if (i25 != Integer.MIN_VALUE) {
                    this.f16441k0 = i25;
                }
                int i26 = this.f16396B;
                if (i26 != Integer.MIN_VALUE) {
                    this.f16443l0 = i26;
                }
            }
            if (this.f16457u == -1 && this.f16458v == -1 && this.f16456t == -1 && this.f16455s == -1) {
                int i27 = this.f16433g;
                if (i27 != -1) {
                    this.f16438i0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f16435h;
                    if (i28 != -1) {
                        this.f16439j0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f16429e;
                if (i29 != -1) {
                    this.f16434g0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f16431f;
                if (i30 != -1) {
                    this.f16436h0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16421a = -1;
            this.f16423b = -1;
            this.f16425c = -1.0f;
            this.f16427d = true;
            this.f16429e = -1;
            this.f16431f = -1;
            this.f16433g = -1;
            this.f16435h = -1;
            this.f16437i = -1;
            this.j = -1;
            this.f16440k = -1;
            this.f16442l = -1;
            this.f16444m = -1;
            this.f16446n = -1;
            this.f16448o = -1;
            this.f16450p = -1;
            this.f16452q = 0;
            this.f16454r = 0.0f;
            this.f16455s = -1;
            this.f16456t = -1;
            this.f16457u = -1;
            this.f16458v = -1;
            this.f16459w = Integer.MIN_VALUE;
            this.f16460x = Integer.MIN_VALUE;
            this.f16461y = Integer.MIN_VALUE;
            this.f16462z = Integer.MIN_VALUE;
            this.f16395A = Integer.MIN_VALUE;
            this.f16396B = Integer.MIN_VALUE;
            this.f16397C = Integer.MIN_VALUE;
            this.f16398D = 0;
            this.f16399E = 0.5f;
            this.f16400F = 0.5f;
            this.f16401G = null;
            this.f16402H = -1.0f;
            this.f16403I = -1.0f;
            this.f16404J = 0;
            this.f16405K = 0;
            this.f16406L = 0;
            this.f16407M = 0;
            this.f16408N = 0;
            this.f16409O = 0;
            this.f16410P = 0;
            this.f16411Q = 0;
            this.f16412R = 1.0f;
            this.f16413S = 1.0f;
            this.f16414T = -1;
            this.f16415U = -1;
            this.f16416V = -1;
            this.f16417W = false;
            this.f16418X = false;
            this.f16419Y = null;
            this.f16420Z = 0;
            this.f16422a0 = true;
            this.f16424b0 = true;
            this.f16426c0 = false;
            this.f16428d0 = false;
            this.f16430e0 = false;
            this.f16432f0 = false;
            this.f16434g0 = -1;
            this.f16436h0 = -1;
            this.f16438i0 = -1;
            this.f16439j0 = -1;
            this.f16441k0 = Integer.MIN_VALUE;
            this.f16443l0 = Integer.MIN_VALUE;
            this.f16445m0 = 0.5f;
            this.f16453q0 = new ConstraintWidget();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p139l0.d.f44124b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = C0168a.f16463a.get(index);
                switch (i11) {
                    case 1:
                        this.f16416V = typedArrayObtainStyledAttributes.getInt(index, this.f16416V);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f16450p);
                        this.f16450p = resourceId;
                        if (resourceId == -1) {
                            this.f16450p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f16452q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16452q);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f16454r) % 360.0f;
                        this.f16454r = f10;
                        if (f10 < 0.0f) {
                            this.f16454r = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f16421a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16421a);
                        break;
                    case 6:
                        this.f16423b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16423b);
                        break;
                    case 7:
                        this.f16425c = typedArrayObtainStyledAttributes.getFloat(index, this.f16425c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16429e);
                        this.f16429e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f16429e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16431f);
                        this.f16431f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f16431f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16433g);
                        this.f16433g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f16433g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16435h);
                        this.f16435h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f16435h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16437i);
                        this.f16437i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f16437i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                        this.j = resourceId7;
                        if (resourceId7 == -1) {
                            this.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16440k);
                        this.f16440k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f16440k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16442l);
                        this.f16442l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f16442l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16444m);
                        this.f16444m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f16444m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16455s);
                        this.f16455s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f16455s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16456t);
                        this.f16456t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f16456t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16457u);
                        this.f16457u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f16457u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16458v);
                        this.f16458v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f16458v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f16459w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16459w);
                        break;
                    case 22:
                        this.f16460x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16460x);
                        break;
                    case 23:
                        this.f16461y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16461y);
                        break;
                    case 24:
                        this.f16462z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16462z);
                        break;
                    case 25:
                        this.f16395A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16395A);
                        break;
                    case 26:
                        this.f16396B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16396B);
                        break;
                    case 27:
                        this.f16417W = typedArrayObtainStyledAttributes.getBoolean(index, this.f16417W);
                        break;
                    case 28:
                        this.f16418X = typedArrayObtainStyledAttributes.getBoolean(index, this.f16418X);
                        break;
                    case 29:
                        this.f16399E = typedArrayObtainStyledAttributes.getFloat(index, this.f16399E);
                        break;
                    case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                        this.f16400F = typedArrayObtainStyledAttributes.getFloat(index, this.f16400F);
                        break;
                    case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f16406L = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f16407M = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                        try {
                            this.f16408N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16408N);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f16408N) == -2) {
                                this.f16408N = -2;
                            }
                        }
                        break;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                        try {
                            this.f16410P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16410P);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f16410P) == -2) {
                                this.f16410P = -2;
                            }
                        }
                        break;
                    case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                        this.f16412R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f16412R));
                        this.f16406L = 2;
                        break;
                    case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                        try {
                            this.f16409O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16409O);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f16409O) == -2) {
                                this.f16409O = -2;
                            }
                        }
                        break;
                    case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        try {
                            this.f16411Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16411Q);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f16411Q) == -2) {
                                this.f16411Q = -2;
                            }
                        }
                        break;
                    case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        this.f16413S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f16413S));
                        this.f16407M = 2;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                androidx.constraintlayout.widget.b.n(this, typedArrayObtainStyledAttributes.getString(index));
                                break;
                            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                                this.f16402H = typedArrayObtainStyledAttributes.getFloat(index, this.f16402H);
                                break;
                            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                                this.f16403I = typedArrayObtainStyledAttributes.getFloat(index, this.f16403I);
                                break;
                            case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                                this.f16404J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                                this.f16405K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                this.f16414T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16414T);
                                break;
                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                this.f16415U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f16415U);
                                break;
                            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                this.f16419Y = typedArrayObtainStyledAttributes.getString(index);
                                break;
                            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16446n);
                                this.f16446n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f16446n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f16448o);
                                this.f16448o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f16448o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                                this.f16398D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16398D);
                                break;
                            case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                                this.f16397C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f16397C);
                                break;
                            default:
                                switch (i11) {
                                    case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                                        androidx.constraintlayout.widget.b.m(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                                        androidx.constraintlayout.widget.b.m(this, typedArrayObtainStyledAttributes, index, 1);
                                        break;
                                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                                        this.f16420Z = typedArrayObtainStyledAttributes.getInt(index, this.f16420Z);
                                        break;
                                    case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                                        this.f16427d = typedArrayObtainStyledAttributes.getBoolean(index, this.f16427d);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public a() {
            super(-2, -2);
            this.f16421a = -1;
            this.f16423b = -1;
            this.f16425c = -1.0f;
            this.f16427d = true;
            this.f16429e = -1;
            this.f16431f = -1;
            this.f16433g = -1;
            this.f16435h = -1;
            this.f16437i = -1;
            this.j = -1;
            this.f16440k = -1;
            this.f16442l = -1;
            this.f16444m = -1;
            this.f16446n = -1;
            this.f16448o = -1;
            this.f16450p = -1;
            this.f16452q = 0;
            this.f16454r = 0.0f;
            this.f16455s = -1;
            this.f16456t = -1;
            this.f16457u = -1;
            this.f16458v = -1;
            this.f16459w = Integer.MIN_VALUE;
            this.f16460x = Integer.MIN_VALUE;
            this.f16461y = Integer.MIN_VALUE;
            this.f16462z = Integer.MIN_VALUE;
            this.f16395A = Integer.MIN_VALUE;
            this.f16396B = Integer.MIN_VALUE;
            this.f16397C = Integer.MIN_VALUE;
            this.f16398D = 0;
            this.f16399E = 0.5f;
            this.f16400F = 0.5f;
            this.f16401G = null;
            this.f16402H = -1.0f;
            this.f16403I = -1.0f;
            this.f16404J = 0;
            this.f16405K = 0;
            this.f16406L = 0;
            this.f16407M = 0;
            this.f16408N = 0;
            this.f16409O = 0;
            this.f16410P = 0;
            this.f16411Q = 0;
            this.f16412R = 1.0f;
            this.f16413S = 1.0f;
            this.f16414T = -1;
            this.f16415U = -1;
            this.f16416V = -1;
            this.f16417W = false;
            this.f16418X = false;
            this.f16419Y = null;
            this.f16420Z = 0;
            this.f16422a0 = true;
            this.f16424b0 = true;
            this.f16426c0 = false;
            this.f16428d0 = false;
            this.f16430e0 = false;
            this.f16432f0 = false;
            this.f16434g0 = -1;
            this.f16436h0 = -1;
            this.f16438i0 = -1;
            this.f16439j0 = -1;
            this.f16441k0 = Integer.MIN_VALUE;
            this.f16443l0 = Integer.MIN_VALUE;
            this.f16445m0 = 0.5f;
            this.f16453q0 = new ConstraintWidget();
        }
    }
}
