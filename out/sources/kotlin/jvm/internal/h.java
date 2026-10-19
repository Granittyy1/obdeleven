package kotlin.jvm.internal;

import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.c0;
import com.braze.Constants;
import com.voltasit.obdeleven.R;
import io.ktor.utils.io.ByteBufferChannel;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import p293xa.r;

/* JADX INFO: compiled from: PrimitiveCompanionObjects.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    public static final ByteBufferChannel a(byte[] content) {
        i.e(content, "content");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(content, 0, content.length);
        i.d(byteBufferWrap, "wrap(content, offset, length)");
        return new ByteBufferChannel(byteBufferWrap);
    }

    public static final CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void c(p184ob.a aVar, p184ob.c cVar, String str) {
        p184ob.d.f45261i.fine(cVar.f45255b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + aVar.f45249a);
    }

    public static View d(int i10, View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View viewFindViewById = viewGroup.getChildAt(i11).findViewById(i10);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static final String e(long j) {
        String strD;
        if (j <= -999500000) {
            strD = p005a4.o.d((j - ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        } else if (j <= -999500) {
            strD = p005a4.o.d((j - ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else if (j <= 0) {
            strD = p005a4.o.d((j - ((long) 500)) / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS), " µs", new StringBuilder());
        } else if (j < 999500) {
            strD = p005a4.o.d((j + ((long) 500)) / ((long) Constants.BRAZE_MINIMUM_NOTIFICATION_DURATION_MILLIS), " µs", new StringBuilder());
        } else if (j < 999500000) {
            strD = p005a4.o.d((j + ((long) 500000)) / ((long) 1000000), " ms", new StringBuilder());
        } else {
            strD = p005a4.o.d((j + ((long) 500000000)) / ((long) 1000000000), " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strD}, 1));
    }

    public static final c0 f(View view) {
        i.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            c0 c0Var = tag instanceof c0 ? (c0) tag : null;
            if (c0Var != null) {
                return c0Var;
            }
            Object objE = G0.a.e(view);
            view = objE instanceof View ? (View) objE : null;
        }
        return null;
    }

    public static final void g(p061ea.a aVar, ByteBuffer byteBuffer, int i10) throws EOFException {
        i.e(aVar, "<this>");
        ByteBuffer byteBuffer2 = aVar.f34855a;
        int i11 = aVar.f34856b;
        if (aVar.f34857c - i11 < i10) {
            throw new EOFException("Not enough bytes to read a buffer content of size " + i10 + '.');
        }
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i10);
            n.f(byteBuffer2, byteBuffer, i11);
            byteBuffer.limit(iLimit);
            r rVar = r.f47939a;
            aVar.c(i10);
        } catch (Throwable th) {
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    public static final void h(View view, c0 c0Var) {
        i.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, c0Var);
    }

    public static final void i(TextPaint textPaint, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f10 * 255));
    }
}
