package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;

/* JADX INFO: compiled from: MotionEventAdapter.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseLongArray f14077b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f14078c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f14079d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14080e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14081f = -1;

    /* JADX WARN: Code duplicated, block: B:72:0x0166  */
    /* JADX WARN: Code duplicated, block: B:74:0x0169  */
    /* JADX WARN: Code duplicated, block: B:76:0x016c  */
    /* JADX WARN: Code duplicated, block: B:78:0x016f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0175  */
    /* JADX WARN: Code duplicated, block: B:82:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x017c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0181  */
    /* JADX WARN: Code duplicated, block: B:85:0x0186  */
    /* JADX WARN: Code duplicated, block: B:88:0x0199  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:99:0x020e  */
    public final s a(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        int i10;
        int i11;
        long jValueAt;
        long j;
        long jB;
        long jFloatToRawIntBits;
        long jS;
        int toolType;
        int i12;
        int historySize;
        int i13;
        char c10;
        long jFloatToRawIntBits2;
        float historicalX;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f14077b;
        SparseBooleanArray sparseBooleanArray = this.f14078c;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType2 = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType2 != this.f14080e || source != this.f14081f) {
                this.f14080e = toolType2;
                this.f14081f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        long j10 = 1;
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j11 = this.f14076a;
                this.f14076a = j11 + 1;
                sparseLongArray.put(pointerId, j11);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else if (actionMasked2 == 9) {
            int pointerId2 = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                long j12 = this.f14076a;
                this.f14076a = j12 + 1;
                sparseLongArray.put(pointerId2, j12);
            }
        }
        boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z11 = actionMasked == 8;
        if (z10) {
            i10 = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i10 = 1;
        }
        int actionIndex2 = actionMasked != i10 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = this.f14079d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i14 = 0;
        while (i14 < pointerCount) {
            boolean z12 = (z10 || i14 == actionIndex2 || (z11 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i14);
            int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (iIndexOfKey >= 0) {
                jValueAt = sparseLongArray.valueAt(iIndexOfKey);
            } else {
                long j13 = this.f14076a;
                this.f14076a = j13 + j10;
                sparseLongArray.put(pointerId3, j13);
                jValueAt = j13;
            }
            float pressure = motionEvent.getPressure(i14);
            long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(motionEvent.getY(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i14))) << 32);
            long jA = I.d.a(0.0f, 3, jFloatToRawIntBits3);
            if (i14 == 0) {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                jS = androidComposeView.S(jFloatToRawIntBits);
            } else {
                if (Build.VERSION.SDK_INT >= 29) {
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getRawY(i14))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(i14))) << 32);
                    jS = androidComposeView.S(jFloatToRawIntBits);
                } else {
                    j = jFloatToRawIntBits3;
                    jB = androidComposeView.B(jFloatToRawIntBits3);
                }
                toolType = motionEvent.getToolType(i14);
                if (toolType == 0) {
                    if (toolType != 1) {
                        i12 = 1;
                    } else if (toolType != 2) {
                        i12 = 3;
                    } else if (toolType != 3) {
                        i12 = 2;
                    } else if (toolType != 4) {
                        i12 = 4;
                    }
                    ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i13 = 0;
                    while (i13 < historySize) {
                        historicalX = motionEvent.getHistoricalX(i14, i13);
                        float historicalY = motionEvent.getHistoricalY(i14, i13);
                        if ((Float.floatToRawIntBits(historicalX) & BrazeLogger.SUPPRESS) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & BrazeLogger.SUPPRESS) < 2139095040) {
                            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(historicalX)) << 32) | (((long) Float.floatToRawIntBits(historicalY)) & 4294967295L);
                            arrayList2.add(new C1153d(motionEvent.getHistoricalEventTime(i13), jFloatToRawIntBits4, jFloatToRawIntBits4));
                        }
                        i13++;
                        actionIndex2 = actionIndex2;
                    }
                    int i15 = actionIndex2;
                    if (motionEvent.getActionMasked() == 8) {
                        c10 = '\t';
                        jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << 32);
                    } else {
                        c10 = '\t';
                        jFloatToRawIntBits2 = 0;
                    }
                    arrayList.add(new t(jValueAt, motionEvent.getEventTime(), jB, j, z12, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList2, jFloatToRawIntBits2, jA));
                    i14++;
                    actionIndex2 = i15;
                    z11 = z11;
                    z10 = z10;
                    j10 = 1;
                }
                i12 = 0;
                ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i13 = 0;
                while (i13 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i14, i13);
                    float historicalY2 = motionEvent.getHistoricalY(i14, i13);
                    if ((Float.floatToRawIntBits(historicalX) & BrazeLogger.SUPPRESS) >= 2139095040) {
                    }
                    i13++;
                    actionIndex2 = actionIndex2;
                }
                int i16 = actionIndex2;
                if (motionEvent.getActionMasked() == 8) {
                    c10 = '\t';
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << 32);
                } else {
                    c10 = '\t';
                    jFloatToRawIntBits2 = 0;
                }
                arrayList.add(new t(jValueAt, motionEvent.getEventTime(), jB, j, z12, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList3, jFloatToRawIntBits2, jA));
                i14++;
                actionIndex2 = i16;
                z11 = z11;
                z10 = z10;
                j10 = 1;
            }
            jB = jFloatToRawIntBits;
            j = jS;
            toolType = motionEvent.getToolType(i14);
            if (toolType == 0) {
                if (toolType != 1) {
                    i12 = 1;
                } else if (toolType != 2) {
                    i12 = 3;
                } else if (toolType != 3) {
                    i12 = 2;
                } else if (toolType != 4) {
                    i12 = 4;
                }
                ArrayList arrayList4 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                i13 = 0;
                while (i13 < historySize) {
                    historicalX = motionEvent.getHistoricalX(i14, i13);
                    float historicalY3 = motionEvent.getHistoricalY(i14, i13);
                    if ((Float.floatToRawIntBits(historicalX) & BrazeLogger.SUPPRESS) >= 2139095040) {
                    }
                    i13++;
                    actionIndex2 = actionIndex2;
                }
                int i17 = actionIndex2;
                if (motionEvent.getActionMasked() == 8) {
                    c10 = '\t';
                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << 32);
                } else {
                    c10 = '\t';
                    jFloatToRawIntBits2 = 0;
                }
                arrayList.add(new t(jValueAt, motionEvent.getEventTime(), jB, j, z12, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList4, jFloatToRawIntBits2, jA));
                i14++;
                actionIndex2 = i17;
                z11 = z11;
                z10 = z10;
                j10 = 1;
            }
            i12 = 0;
            ArrayList arrayList5 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            i13 = 0;
            while (i13 < historySize) {
                historicalX = motionEvent.getHistoricalX(i14, i13);
                float historicalY4 = motionEvent.getHistoricalY(i14, i13);
                if ((Float.floatToRawIntBits(historicalX) & BrazeLogger.SUPPRESS) >= 2139095040) {
                }
                i13++;
                actionIndex2 = actionIndex2;
            }
            int i18 = actionIndex2;
            if (motionEvent.getActionMasked() == 8) {
                c10 = '\t';
                jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << 32);
            } else {
                c10 = '\t';
                jFloatToRawIntBits2 = 0;
            }
            arrayList.add(new t(jValueAt, motionEvent.getEventTime(), jB, j, z12, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i14), false), arrayList5, jFloatToRawIntBits2, jA));
            i14++;
            actionIndex2 = i18;
            z11 = z11;
            z10 = z10;
            j10 = 1;
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i11 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i11 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int iKeyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i19 = i11;
                while (true) {
                    if (i19 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(iKeyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i19) == iKeyAt) {
                        break;
                    }
                    i19++;
                }
            }
        }
        motionEvent.getEventTime();
        s sVar = new s();
        sVar.f14118a = arrayList;
        sVar.f14119b = motionEvent;
        return sVar;
    }
}
