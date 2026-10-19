package androidx.compose.ui.text.input;

import A1.C0575j;
import androidx.compose.ui.text.C1260a;
import java.util.List;

/* JADX INFO: compiled from: EditProcessor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextFieldValue f15541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f15542b;

    public final TextFieldValue a(List<? extends g> list) {
        final g gVar;
        Exception e10;
        try {
            int size = list.size();
            int i10 = 0;
            gVar = null;
            while (i10 < size) {
                try {
                    g gVar2 = list.get(i10);
                    try {
                        gVar2.a(this.f15542b);
                        i10++;
                        gVar = gVar2;
                    } catch (Exception e11) {
                        e10 = e11;
                        gVar = gVar2;
                        StringBuilder sb2 = new StringBuilder();
                        StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                        sb3.append(this.f15542b.f15543a.a());
                        sb3.append(", composition=");
                        sb3.append(this.f15542b.c());
                        sb3.append(", selection=");
                        i iVar = this.f15542b;
                        sb3.append((Object) androidx.compose.ui.text.E.g(O.h.b(iVar.f15544b, iVar.f15545c)));
                        sb3.append("):");
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        kotlin.collections.q.T(list, sb2, "\n", new Ia.l<g, CharSequence>() { // from class: androidx.compose.ui.text.input.EditProcessor$generateBatchErrorMessage$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // Ia.l
                            public final CharSequence invoke(g gVar3) {
                                String strConcat;
                                g gVar4 = gVar3;
                                StringBuilder sbE = C4.b.e(gVar == gVar4 ? " > " : "   ");
                                this.getClass();
                                if (gVar4 instanceof C1269a) {
                                    StringBuilder sb4 = new StringBuilder("CommitTextCommand(text.length=");
                                    C1269a c1269a = (C1269a) gVar4;
                                    sb4.append(c1269a.f15518a.f15408c.length());
                                    sb4.append(", newCursorPosition=");
                                    strConcat = C0575j.b(sb4, c1269a.f15519b, ')');
                                } else if (gVar4 instanceof w) {
                                    StringBuilder sb5 = new StringBuilder("SetComposingTextCommand(text.length=");
                                    w wVar = (w) gVar4;
                                    sb5.append(wVar.f15575a.f15408c.length());
                                    sb5.append(", newCursorPosition=");
                                    strConcat = C0575j.b(sb5, wVar.f15576b, ')');
                                } else if ((gVar4 instanceof v) || (gVar4 instanceof C1273e) || (gVar4 instanceof f) || (gVar4 instanceof x)) {
                                    strConcat = gVar4.toString();
                                } else if (gVar4 instanceof j) {
                                    ((j) gVar4).getClass();
                                    strConcat = "FinishComposingTextCommand()";
                                } else if (gVar4 instanceof C1272d) {
                                    ((C1272d) gVar4).getClass();
                                    strConcat = "DeleteAllCommand()";
                                } else {
                                    String strA = kotlin.jvm.internal.l.a(gVar4.getClass()).a();
                                    if (strA == null) {
                                        strA = "{anonymous EditCommand}";
                                    }
                                    strConcat = "Unknown EditCommand: ".concat(strA);
                                }
                                sbE.append(strConcat);
                                return sbE.toString();
                            }
                        }, 60);
                        String string = sb2.toString();
                        kotlin.jvm.internal.i.d(string, "toString(...)");
                        throw new RuntimeException(string, e10);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                }
            }
            i iVar2 = this.f15542b;
            iVar2.getClass();
            C1260a c1260a = new C1260a(iVar2.f15543a.toString());
            i iVar3 = this.f15542b;
            long jB = O.h.b(iVar3.f15544b, iVar3.f15545c);
            androidx.compose.ui.text.E e13 = androidx.compose.ui.text.E.f(this.f15541a.f15492b) ? null : new androidx.compose.ui.text.E(jB);
            TextFieldValue textFieldValue = new TextFieldValue(c1260a, e13 != null ? e13.f15316a : O.h.b(androidx.compose.ui.text.E.d(jB), androidx.compose.ui.text.E.e(jB)), this.f15542b.c());
            this.f15541a = textFieldValue;
            return textFieldValue;
        } catch (Exception e14) {
            gVar = null;
            e10 = e14;
        }
    }
}
