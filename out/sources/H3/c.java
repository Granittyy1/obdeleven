package H3;

import android.app.Activity;
import android.os.Bundle;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Y;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import p037cb.E;
import p037cb.F;

/* JADX INFO: compiled from: ByteBufferEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements A3.a {
    public static final E a(Ya.b bVar, String str) {
        return new E(str, new F(bVar));
    }

    public static final ExtractedText b(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        String str = textFieldValue.f15491a.f15408c;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = textFieldValue.f15492b;
        extractedText.selectionStart = androidx.compose.ui.text.E.e(j);
        extractedText.selectionEnd = androidx.compose.ui.text.E.d(j);
        extractedText.flags = !kotlin.text.n.K(textFieldValue.f15491a.f15408c, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final String c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bArr[i10];
            i10++;
            stringBuffer.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1)));
        }
        String string = stringBuffer.toString();
        kotlin.jvm.internal.i.d(string, "sb.toString()");
        return string;
    }

    public static Y d(Class modelClass) throws InvocationTargetException {
        kotlin.jvm.internal.i.e(modelClass, "modelClass");
        try {
            Object objNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            kotlin.jvm.internal.i.b(objNewInstance);
            return (Y) objNewInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e12);
        }
    }

    public static final long e(PagerState pagerState) {
        return Ka.a.c(pagerState.k() * pagerState.o()) + (((long) pagerState.j()) * ((long) pagerState.o()));
    }

    public static final View h(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final boolean i(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static void j() {
        Log.isLoggable("FIAM.Display", 3);
    }

    public static void k(String str) {
        Log.e("FIAM.Display", str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    public static final void l(Fragment fragment, String str, Bundle bundle) {
        androidx.fragment.app.y parentFragmentManager = fragment.getParentFragmentManager();
        androidx.fragment.app.y.o oVar = parentFragmentManager.f17686n.get(str);
        if (oVar != null) {
            if (oVar.f17713b.b().compareTo(Lifecycle.State.f17752e) >= 0) {
                oVar.h(bundle, str);
            } else {
                parentFragmentManager.f17685m.put(str, bundle);
            }
        } else {
            parentFragmentManager.f17685m.put(str, bundle);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(bundle);
        }
    }

    public static final int m(androidx.compose.foundation.lazy.k kVar) {
        List<androidx.compose.foundation.lazy.g> listF = kVar.f();
        int size = listF.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            size2 += listF.get(i10).getSize();
        }
        return kVar.e() + (size2 / listF.size());
    }

    public static boolean n(byte b10) {
        return b10 > -65;
    }

    @Override // A3.a
    public boolean f(Object obj, File file, A3.d dVar) throws Throwable {
        try {
            X3.a.b((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }
}
