package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.input.C1269a;
import androidx.compose.ui.text.input.C1273e;
import androidx.compose.ui.text.input.TextFieldValue;
import com.braze.support.BrazeLogger;
import com.google.android.gms.internal.measurement.M1;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: compiled from: TextFieldKeyInput.kt */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends FunctionReferenceImpl implements Ia.l<O.c, Boolean> {
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    public final Boolean h(KeyEvent keyEvent) {
        C1269a c1269a;
        final KeyCommand keyCommandB;
        Integer numValueOf;
        final x xVar = (x) this.receiver;
        xVar.getClass();
        boolean z10 = true;
        if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
            c1269a = null;
        } else {
            C0994c c0994c = xVar.f11642i;
            c0994c.getClass();
            int unicodeChar = keyEvent.getUnicodeChar();
            if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                c0994c.f11248a = Integer.valueOf(unicodeChar & BrazeLogger.SUPPRESS);
                numValueOf = null;
            } else {
                Integer num = c0994c.f11248a;
                if (num != null) {
                    c0994c.f11248a = null;
                    int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                    numValueOf = Integer.valueOf(deadChar);
                    if (deadChar == 0) {
                        numValueOf = null;
                    }
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(unicodeChar);
                    }
                } else {
                    numValueOf = Integer.valueOf(unicodeChar);
                }
            }
            if (numValueOf != null) {
                c1269a = new C1269a(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
            } else {
                c1269a = null;
            }
        }
        androidx.compose.foundation.text.selection.x xVar2 = xVar.f11639f;
        boolean z11 = xVar.f11637d;
        boolean z12 = false;
        if (c1269a != null) {
            if (z11) {
                xVar.a(M1.k(c1269a));
                xVar2.f11629a = null;
            } else {
                z10 = false;
            }
            z12 = z10;
        } else if (O.d.a(O.e.r(keyEvent), 2) && (keyCommandB = xVar.j.b(keyEvent)) != null && (!keyCommandB.a() || z11)) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = true;
            Ia.l<androidx.compose.foundation.text.selection.t, p293xa.r> lVar = new Ia.l<androidx.compose.foundation.text.selection.t, p293xa.r>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2

                /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: TextFieldKeyInput.kt */
                final class AnonymousClass1 extends Lambda implements Ia.l<androidx.compose.foundation.text.selection.t, p293xa.r> {

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public static final AnonymousClass1 f11210h = new AnonymousClass1();

                    public AnonymousClass1() {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.foundation.text.selection.t tVar) {
                        androidx.compose.foundation.text.selection.t tVar2 = tVar;
                        androidx.compose.foundation.text.selection.x xVar = tVar2.f11589e;
                        xVar.f11629a = null;
                        if (tVar2.f11591g.f15408c.length() > 0) {
                            if (tVar2.e()) {
                                xVar.f11629a = null;
                                if (tVar2.f11591g.f15408c.length() > 0) {
                                    String str = tVar2.f11591g.f15408c;
                                    long j = tVar2.f11590f;
                                    int i10 = androidx.compose.ui.text.E.f15315c;
                                    int iQ = p241t7.b.q((int) (j & 4294967295L), str);
                                    if (iQ != -1) {
                                        tVar2.l(iQ, iQ);
                                    }
                                }
                            } else {
                                xVar.f11629a = null;
                                if (tVar2.f11591g.f15408c.length() > 0) {
                                    String str2 = tVar2.f11591g.f15408c;
                                    long j10 = tVar2.f11590f;
                                    int i11 = androidx.compose.ui.text.E.f15315c;
                                    int iO = p241t7.b.o((int) (j10 & 4294967295L), str2);
                                    if (iO != -1) {
                                        tVar2.l(iO, iO);
                                    }
                                }
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                }

                /* JADX INFO: renamed from: androidx.compose.foundation.text.TextFieldKeyInput$process$2$2, reason: invalid class name */
                /* JADX INFO: compiled from: TextFieldKeyInput.kt */
                final class AnonymousClass2 extends Lambda implements Ia.l<androidx.compose.foundation.text.selection.t, p293xa.r> {

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public static final AnonymousClass2 f11211h = new AnonymousClass2();

                    public AnonymousClass2() {
                        super(1);
                    }

                    @Override // Ia.l
                    public final p293xa.r invoke(androidx.compose.foundation.text.selection.t tVar) {
                        androidx.compose.foundation.text.selection.t tVar2 = tVar;
                        androidx.compose.foundation.text.selection.x xVar = tVar2.f11589e;
                        xVar.f11629a = null;
                        if (tVar2.f11591g.f15408c.length() > 0) {
                            if (tVar2.e()) {
                                xVar.f11629a = null;
                                if (tVar2.f11591g.f15408c.length() > 0) {
                                    String str = tVar2.f11591g.f15408c;
                                    long j = tVar2.f11590f;
                                    int i10 = androidx.compose.ui.text.E.f15315c;
                                    int iO = p241t7.b.o((int) (j & 4294967295L), str);
                                    if (iO != -1) {
                                        tVar2.l(iO, iO);
                                    }
                                }
                            } else {
                                xVar.f11629a = null;
                                if (tVar2.f11591g.f15408c.length() > 0) {
                                    String str2 = tVar2.f11591g.f15408c;
                                    long j10 = tVar2.f11590f;
                                    int i11 = androidx.compose.ui.text.E.f15315c;
                                    int iQ = p241t7.b.q((int) (j10 & 4294967295L), str2);
                                    if (iQ != -1) {
                                        tVar2.l(iQ, iQ);
                                    }
                                }
                            }
                        }
                        return p293xa.r.f47939a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // Ia.l
                public final p293xa.r invoke(androidx.compose.foundation.text.selection.t tVar) {
                    Integer numD;
                    Integer numC;
                    Integer numC2;
                    Integer numD2;
                    androidx.compose.ui.text.B b10;
                    androidx.compose.ui.text.B b11;
                    A a10;
                    A a11;
                    androidx.compose.ui.text.B b12;
                    androidx.compose.ui.text.B b13;
                    A a12;
                    A a13;
                    Integer numC3;
                    Integer numD3;
                    Integer numD4;
                    Integer numC4;
                    G.a aVar;
                    androidx.compose.foundation.text.selection.t tVar2 = tVar;
                    TextFieldValue textFieldValue = null;
                    switch (keyCommandB.ordinal()) {
                        case 0:
                            tVar2.f11589e.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (androidx.compose.ui.text.E.b(tVar2.f11590f)) {
                                    AnonymousClass1.f11210h.invoke(tVar2);
                                } else if (!tVar2.e()) {
                                    int iD = androidx.compose.ui.text.E.d(tVar2.f11590f);
                                    tVar2.l(iD, iD);
                                } else {
                                    int iE = androidx.compose.ui.text.E.e(tVar2.f11590f);
                                    tVar2.l(iE, iE);
                                }
                            }
                            break;
                        case 1:
                            tVar2.f11589e.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (androidx.compose.ui.text.E.b(tVar2.f11590f)) {
                                    AnonymousClass2.f11211h.invoke(tVar2);
                                } else if (!tVar2.e()) {
                                    int iE2 = androidx.compose.ui.text.E.e(tVar2.f11590f);
                                    tVar2.l(iE2, iE2);
                                } else {
                                    int iD2 = androidx.compose.ui.text.E.d(tVar2.f11590f);
                                    tVar2.l(iD2, iD2);
                                }
                            }
                            break;
                        case 2:
                            androidx.compose.foundation.text.selection.x xVar3 = tVar2.f11589e;
                            xVar3.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (!tVar2.e()) {
                                    xVar3.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0 && (numD = tVar2.d()) != null) {
                                        int iIntValue = numD.intValue();
                                        tVar2.l(iIntValue, iIntValue);
                                    }
                                } else {
                                    xVar3.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0 && (numC = tVar2.c()) != null) {
                                        int iIntValue2 = numC.intValue();
                                        tVar2.l(iIntValue2, iIntValue2);
                                    }
                                }
                            }
                            break;
                        case 3:
                            androidx.compose.foundation.text.selection.x xVar4 = tVar2.f11589e;
                            xVar4.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (!tVar2.e()) {
                                    xVar4.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0 && (numC2 = tVar2.c()) != null) {
                                        int iIntValue3 = numC2.intValue();
                                        tVar2.l(iIntValue3, iIntValue3);
                                    }
                                } else {
                                    xVar4.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0 && (numD2 = tVar2.d()) != null) {
                                        int iIntValue4 = numD2.intValue();
                                        tVar2.l(iIntValue4, iIntValue4);
                                    }
                                }
                            }
                            break;
                        case 4:
                            tVar2.g();
                            break;
                        case 5:
                            tVar2.h();
                            break;
                        case 6:
                            tVar2.j();
                            break;
                        case 7:
                            tVar2.i();
                            break;
                        case 8:
                            tVar2.f11589e.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (!tVar2.e()) {
                                    tVar2.i();
                                } else {
                                    tVar2.j();
                                }
                            }
                            break;
                        case 9:
                            tVar2.f11589e.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (!tVar2.e()) {
                                    tVar2.j();
                                } else {
                                    tVar2.i();
                                }
                            }
                            break;
                        case 10:
                            if (tVar2.f11591g.f15408c.length() > 0 && (b10 = tVar2.f11587c) != null) {
                                int iF = tVar2.f(b10, -1);
                                tVar2.l(iF, iF);
                            }
                            break;
                        case 11:
                            if (tVar2.f11591g.f15408c.length() > 0 && (b11 = tVar2.f11587c) != null) {
                                int iF2 = tVar2.f(b11, 1);
                                tVar2.l(iF2, iF2);
                            }
                            break;
                        case 12:
                            if (tVar2.f11591g.f15408c.length() > 0 && (a10 = tVar2.f11625i) != null) {
                                int iO = tVar2.o(a10, -1);
                                tVar2.l(iO, iO);
                            }
                            break;
                        case 13:
                            if (tVar2.f11591g.f15408c.length() > 0 && (a11 = tVar2.f11625i) != null) {
                                int iO2 = tVar2.o(a11, 1);
                                tVar2.l(iO2, iO2);
                            }
                            break;
                        case 14:
                            tVar2.f11589e.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                tVar2.l(0, 0);
                            }
                            break;
                        case 15:
                            tVar2.f11589e.f11629a = null;
                            C1260a c1260a = tVar2.f11591g;
                            if (c1260a.f15408c.length() > 0) {
                                int length = c1260a.f15408c.length();
                                tVar2.l(length, length);
                            }
                            break;
                        case 16:
                            xVar.f11635b.c(false);
                            break;
                        case 17:
                            xVar.f11635b.n();
                            break;
                        case 18:
                            xVar.f11635b.e();
                            break;
                        case 19:
                            List<androidx.compose.ui.text.input.g> listN = tVar2.n(new Ia.l<androidx.compose.foundation.text.selection.t, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.3
                                @Override // Ia.l
                                public final androidx.compose.ui.text.input.g invoke(androidx.compose.foundation.text.selection.t tVar3) {
                                    androidx.compose.foundation.text.selection.t tVar4 = tVar3;
                                    long j = tVar4.f11590f;
                                    int i10 = androidx.compose.ui.text.E.f15315c;
                                    return new C1273e(((int) (j & 4294967295L)) - p241t7.b.q((int) (j & 4294967295L), tVar4.f11591g.f15408c), 0);
                                }
                            });
                            if (listN != null) {
                                xVar.a(listN);
                            }
                            break;
                        case 20:
                            List<androidx.compose.ui.text.input.g> listN2 = tVar2.n(new Ia.l<androidx.compose.foundation.text.selection.t, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.4
                                @Override // Ia.l
                                public final androidx.compose.ui.text.input.g invoke(androidx.compose.foundation.text.selection.t tVar3) {
                                    androidx.compose.foundation.text.selection.t tVar4 = tVar3;
                                    String str = tVar4.f11591g.f15408c;
                                    long j = tVar4.f11590f;
                                    int i10 = androidx.compose.ui.text.E.f15315c;
                                    int iO3 = p241t7.b.o((int) (j & 4294967295L), str);
                                    if (iO3 != -1) {
                                        return new C1273e(0, iO3 - ((int) (tVar4.f11590f & 4294967295L)));
                                    }
                                    return null;
                                }
                            });
                            if (listN2 != null) {
                                xVar.a(listN2);
                            }
                            break;
                        case 21:
                            List<androidx.compose.ui.text.input.g> listN3 = tVar2.n(new Ia.l<androidx.compose.foundation.text.selection.t, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.5
                                @Override // Ia.l
                                public final androidx.compose.ui.text.input.g invoke(androidx.compose.foundation.text.selection.t tVar3) {
                                    androidx.compose.foundation.text.selection.t tVar4 = tVar3;
                                    Integer numD5 = tVar4.d();
                                    if (numD5 == null) {
                                        return null;
                                    }
                                    int iIntValue5 = numD5.intValue();
                                    long j = tVar4.f11590f;
                                    int i10 = androidx.compose.ui.text.E.f15315c;
                                    return new C1273e(((int) (j & 4294967295L)) - iIntValue5, 0);
                                }
                            });
                            if (listN3 != null) {
                                xVar.a(listN3);
                            }
                            break;
                        case 22:
                            List<androidx.compose.ui.text.input.g> listN4 = tVar2.n(new Ia.l<androidx.compose.foundation.text.selection.t, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.6
                                @Override // Ia.l
                                public final androidx.compose.ui.text.input.g invoke(androidx.compose.foundation.text.selection.t tVar3) {
                                    androidx.compose.foundation.text.selection.t tVar4 = tVar3;
                                    Integer numC5 = tVar4.c();
                                    if (numC5 == null) {
                                        return null;
                                    }
                                    int iIntValue5 = numC5.intValue();
                                    long j = tVar4.f11590f;
                                    int i10 = androidx.compose.ui.text.E.f15315c;
                                    return new C1273e(0, iIntValue5 - ((int) (j & 4294967295L)));
                                }
                            });
                            if (listN4 != null) {
                                xVar.a(listN4);
                            }
                            break;
                        case 23:
                            List<androidx.compose.ui.text.input.g> listN5 = tVar2.n(new Ia.l<androidx.compose.foundation.text.selection.t, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.7
                                @Override // Ia.l
                                public final androidx.compose.ui.text.input.g invoke(androidx.compose.foundation.text.selection.t tVar3) {
                                    androidx.compose.foundation.text.selection.t tVar4 = tVar3;
                                    Integer numB = tVar4.b();
                                    if (numB == null) {
                                        return null;
                                    }
                                    int iIntValue5 = numB.intValue();
                                    long j = tVar4.f11590f;
                                    int i10 = androidx.compose.ui.text.E.f15315c;
                                    return new C1273e(((int) (j & 4294967295L)) - iIntValue5, 0);
                                }
                            });
                            if (listN5 != null) {
                                xVar.a(listN5);
                            }
                            break;
                        case 24:
                            List<androidx.compose.ui.text.input.g> listN6 = tVar2.n(new Ia.l<androidx.compose.foundation.text.selection.t, androidx.compose.ui.text.input.g>() { // from class: androidx.compose.foundation.text.TextFieldKeyInput$process$2.8
                                @Override // Ia.l
                                public final androidx.compose.ui.text.input.g invoke(androidx.compose.foundation.text.selection.t tVar3) {
                                    androidx.compose.foundation.text.selection.t tVar4 = tVar3;
                                    Integer numA = tVar4.a();
                                    if (numA == null) {
                                        return null;
                                    }
                                    int iIntValue5 = numA.intValue();
                                    long j = tVar4.f11590f;
                                    int i10 = androidx.compose.ui.text.E.f15315c;
                                    return new C1273e(0, iIntValue5 - ((int) (j & 4294967295L)));
                                }
                            });
                            if (listN6 != null) {
                                xVar.a(listN6);
                            }
                            break;
                        case 25:
                            tVar2.f11589e.f11629a = null;
                            C1260a c1260a2 = tVar2.f11591g;
                            if (c1260a2.f15408c.length() > 0) {
                                tVar2.l(0, c1260a2.f15408c.length());
                            }
                            break;
                        case 26:
                            androidx.compose.foundation.text.selection.x xVar5 = tVar2.f11589e;
                            xVar5.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (tVar2.e()) {
                                    xVar5.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0) {
                                        String str = tVar2.f11591g.f15408c;
                                        long j = tVar2.f11590f;
                                        int i10 = androidx.compose.ui.text.E.f15315c;
                                        int iQ = p241t7.b.q((int) (4294967295L & j), str);
                                        if (iQ != -1) {
                                            tVar2.l(iQ, iQ);
                                        }
                                    }
                                } else {
                                    xVar5.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0) {
                                        String str2 = tVar2.f11591g.f15408c;
                                        long j10 = tVar2.f11590f;
                                        int i11 = androidx.compose.ui.text.E.f15315c;
                                        int iO3 = p241t7.b.o((int) (4294967295L & j10), str2);
                                        if (iO3 != -1) {
                                            tVar2.l(iO3, iO3);
                                        }
                                    }
                                }
                            }
                            tVar2.k();
                            break;
                        case 27:
                            androidx.compose.foundation.text.selection.x xVar6 = tVar2.f11589e;
                            xVar6.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (tVar2.e()) {
                                    xVar6.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0) {
                                        String str3 = tVar2.f11591g.f15408c;
                                        long j11 = tVar2.f11590f;
                                        int i12 = androidx.compose.ui.text.E.f15315c;
                                        int iO4 = p241t7.b.o((int) (4294967295L & j11), str3);
                                        if (iO4 != -1) {
                                            tVar2.l(iO4, iO4);
                                        }
                                    }
                                } else {
                                    xVar6.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0) {
                                        String str4 = tVar2.f11591g.f15408c;
                                        long j12 = tVar2.f11590f;
                                        int i13 = androidx.compose.ui.text.E.f15315c;
                                        int iQ2 = p241t7.b.q((int) (4294967295L & j12), str4);
                                        if (iQ2 != -1) {
                                            tVar2.l(iQ2, iQ2);
                                        }
                                    }
                                }
                            }
                            tVar2.k();
                            break;
                        case 28:
                            if (tVar2.f11591g.f15408c.length() > 0 && (b12 = tVar2.f11587c) != null) {
                                int iF3 = tVar2.f(b12, -1);
                                tVar2.l(iF3, iF3);
                            }
                            tVar2.k();
                            break;
                        case 29:
                            if (tVar2.f11591g.f15408c.length() > 0 && (b13 = tVar2.f11587c) != null) {
                                int iF4 = tVar2.f(b13, 1);
                                tVar2.l(iF4, iF4);
                            }
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                            if (tVar2.f11591g.f15408c.length() > 0 && (a12 = tVar2.f11625i) != null) {
                                int iO5 = tVar2.o(a12, -1);
                                tVar2.l(iO5, iO5);
                            }
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                            if (tVar2.f11591g.f15408c.length() > 0 && (a13 = tVar2.f11625i) != null) {
                                int iO6 = tVar2.o(a13, 1);
                                tVar2.l(iO6, iO6);
                            }
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                            tVar2.f11589e.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                tVar2.l(0, 0);
                            }
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                            tVar2.f11589e.f11629a = null;
                            C1260a c1260a3 = tVar2.f11591g;
                            if (c1260a3.f15408c.length() > 0) {
                                int length2 = c1260a3.f15408c.length();
                                tVar2.l(length2, length2);
                            }
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                            androidx.compose.foundation.text.selection.x xVar7 = tVar2.f11589e;
                            xVar7.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (tVar2.e()) {
                                    xVar7.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0 && (numD3 = tVar2.d()) != null) {
                                        int iIntValue5 = numD3.intValue();
                                        tVar2.l(iIntValue5, iIntValue5);
                                    }
                                } else {
                                    xVar7.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0 && (numC3 = tVar2.c()) != null) {
                                        int iIntValue6 = numC3.intValue();
                                        tVar2.l(iIntValue6, iIntValue6);
                                    }
                                }
                            }
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                            androidx.compose.foundation.text.selection.x xVar8 = tVar2.f11589e;
                            xVar8.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (tVar2.e()) {
                                    xVar8.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0 && (numC4 = tVar2.c()) != null) {
                                        int iIntValue7 = numC4.intValue();
                                        tVar2.l(iIntValue7, iIntValue7);
                                    }
                                } else {
                                    xVar8.f11629a = null;
                                    if (tVar2.f11591g.f15408c.length() > 0 && (numD4 = tVar2.d()) != null) {
                                        int iIntValue8 = numD4.intValue();
                                        tVar2.l(iIntValue8, iIntValue8);
                                    }
                                }
                            }
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                            tVar2.g();
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                            tVar2.h();
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                            tVar2.j();
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            tVar2.i();
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                            tVar2.f11589e.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (tVar2.e()) {
                                    tVar2.j();
                                } else {
                                    tVar2.i();
                                }
                            }
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                            tVar2.f11589e.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                if (tVar2.e()) {
                                    tVar2.i();
                                } else {
                                    tVar2.j();
                                }
                            }
                            tVar2.k();
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                            tVar2.f11589e.f11629a = null;
                            if (tVar2.f11591g.f15408c.length() > 0) {
                                long j13 = tVar2.f11590f;
                                int i14 = androidx.compose.ui.text.E.f15315c;
                                int i15 = (int) (j13 & 4294967295L);
                                tVar2.l(i15, i15);
                            }
                            break;
                        case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                            x xVar9 = xVar;
                            if (!xVar9.f11638e) {
                                xVar9.a(M1.k(new C1269a("\n", 1)));
                            } else {
                                ((LegacyTextFieldState$onImeActionPerformed$1) xVar9.f11634a.f11198w).invoke(new androidx.compose.ui.text.input.k(xVar9.f11644l));
                            }
                            break;
                        case 44:
                            x xVar10 = xVar;
                            if (!xVar10.f11638e) {
                                xVar10.a(M1.k(new C1269a("\t", 1)));
                            } else {
                                ref$BooleanRef.element = false;
                            }
                            break;
                        case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                            G g10 = xVar.f11641h;
                            if (g10 != null) {
                                g10.a(TextFieldValue.a(tVar2.f11624h, tVar2.f11591g, tVar2.f11590f, 4));
                            }
                            G g11 = xVar.f11641h;
                            if (g11 != null) {
                                G.a aVar2 = g11.f11103b;
                                if (aVar2 != null && (aVar = aVar2.f11108a) != null) {
                                    g11.f11103b = aVar;
                                    g11.f11105d -= aVar2.f11109b.f15491a.f15408c.length();
                                    g11.f11104c = new G.a(g11.f11104c, aVar2.f11109b);
                                    textFieldValue = aVar.f11109b;
                                }
                                if (textFieldValue != null) {
                                    xVar.f11643k.invoke(textFieldValue);
                                }
                            }
                            break;
                        case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                            G g12 = xVar.f11641h;
                            if (g12 != null) {
                                G.a aVar3 = g12.f11104c;
                                if (aVar3 != null) {
                                    g12.f11104c = aVar3.f11108a;
                                    TextFieldValue textFieldValue2 = aVar3.f11109b;
                                    g12.f11103b = new G.a(g12.f11103b, textFieldValue2);
                                    g12.f11105d = textFieldValue2.f15491a.f15408c.length() + g12.f11105d;
                                    textFieldValue = aVar3.f11109b;
                                }
                                if (textFieldValue != null) {
                                    xVar.f11643k.invoke(textFieldValue);
                                }
                            }
                            break;
                    }
                    return p293xa.r.f47939a;
                }
            };
            A aD = xVar.f11634a.d();
            androidx.compose.ui.text.input.r rVar = xVar.f11640g;
            TextFieldValue textFieldValue = xVar.f11636c;
            androidx.compose.foundation.text.selection.t tVar = new androidx.compose.foundation.text.selection.t(textFieldValue, rVar, aD, xVar2);
            lVar.invoke(tVar);
            if (!androidx.compose.ui.text.E.a(tVar.f11590f, textFieldValue.f15492b) || !kotlin.jvm.internal.i.a(tVar.f11591g, textFieldValue.f15491a)) {
                xVar.f11643k.invoke(TextFieldValue.a(textFieldValue, tVar.f11591g, tVar.f11590f, 4));
            }
            G g10 = xVar.f11641h;
            if (g10 != null) {
                g10.f11107f = true;
            }
            z12 = ref$BooleanRef.element;
        }
        return Boolean.valueOf(z12);
    }

    @Override // Ia.l
    public final /* synthetic */ Boolean invoke(O.c cVar) {
        return h(cVar.f4721a);
    }
}
