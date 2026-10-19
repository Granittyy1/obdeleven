package com.voltasit.obdeleven.domain.usecases.device;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.ExtractedText;
import androidx.appcompat.widget.P;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.E;
import androidx.compose.ui.text.input.TextFieldValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CancellationException;
import org.slf4j.helpers.NOPLogger;

/* JADX INFO: compiled from: SetIsoTpTransferIdUC.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v implements cc.a {
    public static void b(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i10 = inputStream.read(bArr);
        while (i10 >= 0) {
            outputStream.write(bArr, 0, i10);
            i10 = inputStream.read(bArr);
        }
    }

    public static final int c(int i10, String str) {
        int length = str.length();
        while (i10 < length) {
            if (str.charAt(i10) == '\n') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static final int d(int i10, String str) {
        while (i10 > 0) {
            if (str.charAt(i10 - 1) == '\n') {
                return i10;
            }
            i10--;
        }
        return 0;
    }

    public static Drawable e(Context context, int i10) {
        return P.b().c(context, i10);
    }

    public static String f(String str, String str2) {
        return B6.c.d("https://console.firebase.google.com/project/", str, "/performance/app/android:", str2);
    }

    public static final String g(InterfaceC1084f interfaceC1084f, int i10) {
        interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14792a);
        return ((Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b)).getResources().getString(i10);
    }

    public static final ExtractedText h(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        String str = textFieldValue.f15491a.f15408c;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = textFieldValue.f15492b;
        extractedText.selectionStart = E.e(j);
        extractedText.selectionEnd = E.d(j);
        extractedText.flags = !kotlin.text.n.K(textFieldValue.f15491a.f15408c, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final Throwable i(Throwable th) {
        kotlin.jvm.internal.i.e(th, "<this>");
        Throwable cause = th;
        while (cause instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) cause;
            if (kotlin.jvm.internal.i.a(cause, cancellationException.getCause())) {
                return th;
            }
            cause = cancellationException.getCause();
        }
        return cause == null ? th : cause;
    }

    @Override // cc.a
    public cc.b a(String str) {
        return NOPLogger.f45778b;
    }
}
