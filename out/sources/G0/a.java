package G0;

import Q3.d;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.compose.ui.graphics.H;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.h;
import androidx.core.view.C1293h;
import androidx.datastore.preferences.protobuf.ByteString;
import androidx.paging.I;
import androidx.paging.LoadType;
import com.voltasit.obdeleven.R;
import java.io.EOFException;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import p013b0.n;
import p013b0.o;

/* JADX INFO: compiled from: ViewTree.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final float a(long j, float f10, long j10, long j11) {
        long jI = d.i(H.b(f10, j), j11);
        float fD = d.D(d.i(j10, jI)) + 0.05f;
        float fD2 = d.D(jI) + 0.05f;
        return Math.max(fD, fD2) / Math.min(fD, fD2);
    }

    public static final void b(int i10, int i11) throws EOFException {
        throw new EOFException(C1293h.h("Unable to discard ", " bytes: only ", " available for writing", i10, i11));
    }

    public static final void c(int i10, int i11) throws EOFException {
        throw new EOFException(C1293h.h("Unable to discard ", " bytes: only ", " available for reading", i10, i11));
    }

    public static String d(ByteString byteString) {
        StringBuilder sb2 = new StringBuilder(byteString.size());
        for (int i10 = 0; i10 < byteString.size(); i10++) {
            byte bD = byteString.d(i10);
            if (bD == 34) {
                sb2.append("\\\"");
            } else if (bD == 39) {
                sb2.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bD >>> 6) & 3) + 48));
                            sb2.append((char) (((bD >>> 3) & 7) + 48));
                            sb2.append((char) ((bD & 7) + 48));
                        } else {
                            sb2.append((char) bD);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static final ViewParent e(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final long f(double d10) {
        return i((float) d10, 4294967296L);
    }

    public static final long g(int i10) {
        return i(i10, 4294967296L);
    }

    public static boolean h(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static final long i(float f10, long j) {
        long jFloatToRawIntBits = j | (((long) Float.floatToRawIntBits(f10)) & 4294967295L);
        o[] oVarArr = n.f20492b;
        return jFloatToRawIntBits;
    }

    public static final h j(h hVar, float f10) {
        return f10 == 0.0f ? hVar : T.b(hVar, 0.0f, 0.0f, 0.0f, 0.0f, f10, null, false, 130815);
    }

    public static final boolean k(I i10, I i11, LoadType loadType) {
        i.e(i10, "<this>");
        i.e(loadType, "loadType");
        if (i11 == null) {
            return true;
        }
        if ((i11 instanceof I.b) && (i10 instanceof I.a)) {
            return true;
        }
        return (((i10 instanceof I.b) && (i11 instanceof I.a)) || (i10.f19248c == i11.f19248c && i10.f19249d == i11.f19249d && i11.a(loadType) <= i10.a(loadType))) ? false : true;
    }

    public static final String l(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }
}
