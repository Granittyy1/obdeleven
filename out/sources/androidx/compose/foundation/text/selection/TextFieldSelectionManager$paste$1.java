package androidx.compose.foundation.text.selection;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.Spanned;
import android.util.Base64;
import androidx.compose.foundation.text.G;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.platform.Y;
import androidx.compose.ui.platform.Z;
import androidx.compose.ui.text.C1260a;
import androidx.compose.ui.text.E;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.A;
import kotlinx.coroutines.C;

/* JADX INFO: compiled from: TextFieldSelectionManager.kt */
/* JADX INFO: loaded from: classes.dex */
@Aa.c(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$paste$1", f = "TextFieldSelectionManager.kt", l = {647}, m = "invokeSuspend")
final class TextFieldSelectionManager$paste$1 extends SuspendLambda implements Ia.p<A, kotlin.coroutines.c<? super p293xa.r>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$paste$1(TextFieldSelectionManager textFieldSelectionManager, kotlin.coroutines.c<? super TextFieldSelectionManager$paste$1> cVar) {
        super(2, cVar);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
        return new TextFieldSelectionManager$paste$1(this.this$0, cVar);
    }

    @Override // Ia.p
    public final Object invoke(A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
        return ((TextFieldSelectionManager$paste$1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Type inference failed for: r3v18, types: [Ia.l, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        C1260a c1260a;
        CharSequence text;
        C1260a c1260a2;
        int i10;
        int i11;
        byte b10;
        byte b11 = 2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
        int i12 = this.label;
        if (i12 == 0) {
            kotlin.b.b(obj);
            Z z10 = this.this$0.f11559h;
            if (z10 != null) {
                this.label = 1;
                objB = z10.b();
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return p293xa.r.f47939a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        objB = obj;
        Y y10 = (Y) objB;
        if (y10 != null) {
            ClipData clipData = y10.f15013a;
            int i13 = 0;
            ClipData.Item itemAt = clipData.getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null) {
                c1260a = null;
            } else {
                if (text instanceof Spanned) {
                    Spanned spanned = (Spanned) text;
                    Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
                    ArrayList arrayList = new ArrayList();
                    int iS = kotlin.collections.k.S(annotationArr);
                    if (iS >= 0) {
                        int i14 = 0;
                        while (true) {
                            Annotation annotation = annotationArr[i14];
                            if (kotlin.jvm.internal.i.a(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                                int spanStart = spanned.getSpanStart(annotation);
                                int spanEnd = spanned.getSpanEnd(annotation);
                                String value = annotation.getValue();
                                Parcel parcelObtain = Parcel.obtain();
                                byte[] bArrDecode = Base64.decode(value, i13);
                                parcelObtain.unmarshall(bArrDecode, i13, bArrDecode.length);
                                parcelObtain.setDataPosition(i13);
                                long j = H.f13504l;
                                long j10 = j;
                                long jI = p013b0.n.f20493c;
                                long jI2 = jI;
                                androidx.compose.ui.text.font.l lVar = null;
                                androidx.compose.ui.text.font.j jVar = null;
                                androidx.compose.ui.text.font.k kVar = null;
                                String string = null;
                                androidx.compose.ui.text.style.a aVar = null;
                                androidx.compose.ui.text.style.j jVar2 = null;
                                androidx.compose.ui.text.style.h hVar = null;
                                k0 k0Var = null;
                                while (true) {
                                    if (parcelObtain.dataAvail() > 1) {
                                        byte b12 = parcelObtain.readByte();
                                        if (b12 != 1) {
                                            i11 = spanStart;
                                            if (b12 == b11) {
                                                if (parcelObtain.dataAvail() < 5) {
                                                    i10 = 0;
                                                    break;
                                                }
                                                byte b13 = parcelObtain.readByte();
                                                long j11 = b13 == 1 ? 4294967296L : b13 == b11 ? 8589934592L : 0L;
                                                jI = p013b0.o.a(j11, 0L) ? p013b0.n.f20493c : G0.a.i(parcelObtain.readFloat(), j11);
                                                spanStart = i11;
                                                i13 = 0;
                                            } else if (b12 == 3) {
                                                if (parcelObtain.dataAvail() < 4) {
                                                    i10 = 0;
                                                    break;
                                                }
                                                lVar = new androidx.compose.ui.text.font.l(parcelObtain.readInt());
                                                spanStart = i11;
                                                i13 = 0;
                                            } else if (b12 == 4) {
                                                if (parcelObtain.dataAvail() < 1) {
                                                    i10 = 0;
                                                    break;
                                                }
                                                byte b14 = parcelObtain.readByte();
                                                jVar = new androidx.compose.ui.text.font.j((b14 != 0 && b14 == 1) ? 1 : 0);
                                                spanStart = i11;
                                                i13 = 0;
                                            } else if (b12 != 5) {
                                                if (b12 == 6) {
                                                    string = parcelObtain.readString();
                                                } else if (b12 == 7) {
                                                    if (parcelObtain.dataAvail() < 5) {
                                                        i10 = 0;
                                                        break;
                                                    }
                                                    byte b15 = parcelObtain.readByte();
                                                    long j12 = b15 == 1 ? 4294967296L : b15 == b11 ? 8589934592L : 0L;
                                                    jI2 = p013b0.o.a(j12, 0L) ? p013b0.n.f20493c : G0.a.i(parcelObtain.readFloat(), j12);
                                                } else if (b12 != 8) {
                                                    if (b12 != 9) {
                                                        if (b12 != 10) {
                                                            if (b12 != 11) {
                                                                i10 = 0;
                                                                if (b12 == 12) {
                                                                    if (parcelObtain.dataAvail() < 20) {
                                                                        break;
                                                                    }
                                                                    long j13 = parcelObtain.readLong();
                                                                    int i15 = H.f13505m;
                                                                    k0Var = new k0(parcelObtain.readFloat(), j13, (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) << 32) | (((long) Float.floatToRawIntBits(parcelObtain.readFloat())) & 4294967295L));
                                                                }
                                                            } else if (parcelObtain.dataAvail() >= 4) {
                                                                int i16 = parcelObtain.readInt();
                                                                boolean z11 = (i16 & 2) != 0;
                                                                boolean z12 = (i16 & 1) != 0;
                                                                androidx.compose.ui.text.style.h hVar2 = androidx.compose.ui.text.style.h.f15672d;
                                                                androidx.compose.ui.text.style.h hVar3 = androidx.compose.ui.text.style.h.f15671c;
                                                                if (z11 && z12) {
                                                                    List listS = kotlin.collections.l.s(hVar2, hVar3);
                                                                    i10 = 0;
                                                                    Integer numValueOf = 0;
                                                                    int size = listS.size();
                                                                    for (int i17 = 0; i17 < size; i17++) {
                                                                        numValueOf = Integer.valueOf(((androidx.compose.ui.text.style.h) listS.get(i17)).f15673a | numValueOf.intValue());
                                                                    }
                                                                    hVar = new androidx.compose.ui.text.style.h(numValueOf.intValue());
                                                                } else {
                                                                    i10 = 0;
                                                                    hVar = z11 ? hVar2 : z12 ? hVar3 : androidx.compose.ui.text.style.h.f15670b;
                                                                }
                                                            }
                                                            i13 = i10;
                                                            spanStart = i11;
                                                            b11 = 2;
                                                        } else if (parcelObtain.dataAvail() >= 8) {
                                                            j10 = parcelObtain.readLong();
                                                            int i18 = H.f13505m;
                                                        }
                                                        i10 = 0;
                                                        break;
                                                    }
                                                    if (parcelObtain.dataAvail() < 8) {
                                                        i10 = 0;
                                                        break;
                                                    }
                                                    jVar2 = new androidx.compose.ui.text.style.j(parcelObtain.readFloat(), parcelObtain.readFloat());
                                                } else {
                                                    if (parcelObtain.dataAvail() < 4) {
                                                        i10 = 0;
                                                        break;
                                                    }
                                                    aVar = new androidx.compose.ui.text.style.a(parcelObtain.readFloat());
                                                }
                                                spanStart = i11;
                                                i13 = 0;
                                            } else {
                                                if (parcelObtain.dataAvail() < 1) {
                                                    i10 = 0;
                                                    break;
                                                }
                                                byte b16 = parcelObtain.readByte();
                                                if (b16 == 0) {
                                                    b10 = 0;
                                                } else if (b16 == 1) {
                                                    b10 = 65535;
                                                } else if (b16 == 3) {
                                                    b10 = b11;
                                                } else if (b16 == b11) {
                                                    b10 = 1;
                                                } else {
                                                    b10 = 0;
                                                }
                                                kVar = new androidx.compose.ui.text.font.k(b10);
                                                spanStart = i11;
                                                i13 = 0;
                                            }
                                        } else if (parcelObtain.dataAvail() >= 8) {
                                            j = parcelObtain.readLong();
                                            int i19 = H.f13505m;
                                        }
                                    }
                                    i10 = i13;
                                    i11 = spanStart;
                                    break;
                                }
                                arrayList.add(new C1260a.c(i11, spanEnd, new androidx.compose.ui.text.v(j, jI, lVar, jVar, kVar, null, string, jI2, aVar, jVar2, null, j10, hVar, k0Var, 49152)));
                            } else {
                                i10 = i13;
                            }
                            if (i14 == iS) {
                                break;
                            }
                            i14++;
                            i13 = i10;
                            b11 = 2;
                        }
                    }
                    c1260a2 = new C1260a(4, text.toString(), arrayList);
                } else {
                    c1260a2 = new C1260a(text.toString());
                }
                c1260a = c1260a2;
            }
            if (c1260a != null) {
                C1260a.b bVar = new C1260a.b(C.q(this.this$0.l(), this.this$0.l().f15491a.f15408c.length()));
                bVar.b(c1260a);
                C1260a c1260aI = bVar.i();
                C1260a c1260aP = C.p(this.this$0.l(), this.this$0.l().f15491a.f15408c.length());
                C1260a.b bVar2 = new C1260a.b(c1260aI);
                bVar2.b(c1260aP);
                C1260a c1260aI2 = bVar2.i();
                int length = c1260a.f15408c.length() + E.e(this.this$0.l().f15492b);
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                long jB = O.h.b(length, length);
                textFieldSelectionManager.getClass();
                this.this$0.f11554c.invoke(TextFieldSelectionManager.d(c1260aI2, jB));
                this.this$0.p(HandleState.f11117b);
                G g10 = this.this$0.f11552a;
                if (g10 != null) {
                    g10.f11107f = true;
                }
                return p293xa.r.f47939a;
            }
        }
        return p293xa.r.f47939a;
    }
}
