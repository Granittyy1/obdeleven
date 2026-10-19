package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import androidx.compose.runtime.C1079c0;
import androidx.compose.runtime.C1083e0;
import androidx.compose.runtime.J0;
import io.intercom.android.sdk.BuildConfig;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C2680e;
import kotlinx.coroutines.InterfaceC2694i0;

/* JADX INFO: compiled from: VoiceInputLayout.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class SpeechRecognizerState implements RecognitionListener {
    private static final int TIMEOUT_IN_MILLIS = 5000;
    private final androidx.compose.runtime.X completedText$delegate;
    private final boolean isSpeechRecognizerAvailable;
    private final Ia.l<SpeechState, p293xa.r> onStateChange;
    private final androidx.compose.runtime.U rms$delegate;
    private final kotlinx.coroutines.A scope;
    private final SpeechRecognizer speechRecognizer;
    private final androidx.compose.runtime.X speechState$delegate;
    private final androidx.compose.runtime.X textInProgress$delegate;
    private InterfaceC2694i0 timeoutJob;
    private final androidx.compose.runtime.W timer$delegate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: VoiceInputLayout.kt */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: VoiceInputLayout.kt */
    public interface SpeechState {

        /* JADX INFO: compiled from: VoiceInputLayout.kt */
        public static final class Listening implements SpeechState {
            public static final int $stable = 0;
            public static final Listening INSTANCE = new Listening();

            private Listening() {
            }
        }

        /* JADX INFO: compiled from: VoiceInputLayout.kt */
        public static final class SpeechEnded implements SpeechState {
            public static final int $stable = 0;
            private final long duration;
            private final String message;

            public SpeechEnded(String message, long j) {
                kotlin.jvm.internal.i.e(message, "message");
                this.message = message;
                this.duration = j;
            }

            public static /* synthetic */ SpeechEnded copy$default(SpeechEnded speechEnded, String str, long j, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = speechEnded.message;
                }
                if ((i10 & 2) != 0) {
                    j = speechEnded.duration;
                }
                return speechEnded.copy(str, j);
            }

            public final String component1() {
                return this.message;
            }

            public final long component2() {
                return this.duration;
            }

            public final SpeechEnded copy(String message, long j) {
                kotlin.jvm.internal.i.e(message, "message");
                return new SpeechEnded(message, j);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SpeechEnded)) {
                    return false;
                }
                SpeechEnded speechEnded = (SpeechEnded) obj;
                return kotlin.jvm.internal.i.a(this.message, speechEnded.message) && this.duration == speechEnded.duration;
            }

            public final long getDuration() {
                return this.duration;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return Long.hashCode(this.duration) + (this.message.hashCode() * 31);
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("SpeechEnded(message=");
                sb2.append(this.message);
                sb2.append(", duration=");
                return C4.a.h(sb2, this.duration, ')');
            }
        }

        /* JADX INFO: compiled from: VoiceInputLayout.kt */
        public static final class SpeechInProgress implements SpeechState {
            public static final int $stable = 0;
            private final String message;

            public SpeechInProgress(String message) {
                kotlin.jvm.internal.i.e(message, "message");
                this.message = message;
            }

            public static /* synthetic */ SpeechInProgress copy$default(SpeechInProgress speechInProgress, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = speechInProgress.message;
                }
                return speechInProgress.copy(str);
            }

            public final String component1() {
                return this.message;
            }

            public final SpeechInProgress copy(String message) {
                kotlin.jvm.internal.i.e(message, "message");
                return new SpeechInProgress(message);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SpeechInProgress) && kotlin.jvm.internal.i.a(this.message, ((SpeechInProgress) obj).message);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return B7.b.g(new StringBuilder("SpeechInProgress(message="), this.message, ')');
            }
        }

        /* JADX INFO: compiled from: VoiceInputLayout.kt */
        public static final class SpeechStarted implements SpeechState {
            public static final int $stable = 0;
            public static final SpeechStarted INSTANCE = new SpeechStarted();

            private SpeechStarted() {
            }
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState$onEndOfSpeech$1, reason: invalid class name */
    /* JADX INFO: compiled from: VoiceInputLayout.kt */
    @Aa.c(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SpeechRecognizerState$onEndOfSpeech$1", f = "VoiceInputLayout.kt", l = {297}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements Ia.p<kotlinx.coroutines.A, kotlin.coroutines.c<? super p293xa.r>, Object> {
        int label;

        public AnonymousClass1(kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.c<p293xa.r> create(Object obj, kotlin.coroutines.c<?> cVar) {
            return SpeechRecognizerState.this.new AnonymousClass1(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f43038b;
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.b.b(obj);
                this.label = 1;
                if (kotlinx.coroutines.I.b(5000L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            SpeechRecognizerState.this.stopListening();
            return p293xa.r.f47939a;
        }

        @Override // Ia.p
        public final Object invoke(kotlinx.coroutines.A a10, kotlin.coroutines.c<? super p293xa.r> cVar) {
            return ((AnonymousClass1) create(a10, cVar)).invokeSuspend(p293xa.r.f47939a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpeechRecognizerState(SpeechRecognizer speechRecognizer, boolean z10, Ia.l<? super SpeechState, p293xa.r> onStateChange) {
        kotlin.jvm.internal.i.e(speechRecognizer, "speechRecognizer");
        kotlin.jvm.internal.i.e(onStateChange, "onStateChange");
        this.speechRecognizer = speechRecognizer;
        this.isSpeechRecognizerAvailable = z10;
        this.onStateChange = onStateChange;
        Sa.b bVar = kotlinx.coroutines.N.f43198a;
        this.scope = kotlinx.coroutines.B.a(kotlinx.coroutines.internal.q.f43500a);
        this.textInProgress$delegate = J0.f("");
        this.completedText$delegate = J0.f("");
        this.speechState$delegate = J0.f(null);
        this.timer$delegate = new C1083e0(0L);
        this.rms$delegate = new C1079c0(0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getCompletedText() {
        return (String) this.completedText$delegate.getValue();
    }

    private final float getRms() {
        return this.rms$delegate.j();
    }

    private final SpeechState getSpeechState() {
        return (SpeechState) this.speechState$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final String getTextInProgress() {
        return (String) this.textInProgress$delegate.getValue();
    }

    private final long getTimer() {
        return this.timer$delegate.b();
    }

    private final void reset() {
        setSpeechState(null);
        setCompletedText("");
        setTextInProgress("");
    }

    private final void setCompletedText(String str) {
        this.completedText$delegate.setValue(str);
    }

    private final void setRms(float f10) {
        this.rms$delegate.f(f10);
    }

    private final void setSpeechState(SpeechState speechState) {
        this.speechState$delegate.setValue(speechState);
    }

    private final void setTextInProgress(String str) {
        this.textInProgress$delegate.setValue(str);
    }

    private final void setTimer(long j) {
        this.timer$delegate.t(j);
    }

    private final void updateEndOfSpeechText(String str) {
        if (getSpeechState() == null || (getSpeechState() instanceof SpeechState.SpeechEnded)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getCompletedText());
        setCompletedText(Q8.d.a(sb2, getTextInProgress(), str));
        updateState(new SpeechState.SpeechEnded(getCompletedText(), System.currentTimeMillis() - getTimer()));
        reset();
    }

    private final void updateProgressText(String str) {
        if (kotlin.text.n.S(str)) {
            return;
        }
        setTextInProgress(str);
        updateState(new SpeechState.SpeechInProgress(getCompletedText() + getTextInProgress()));
    }

    private final void updateState(SpeechState speechState) {
        setSpeechState(speechState);
        if (speechState != null) {
            this.onStateChange.invoke(speechState);
        }
    }

    public final float getAmplitude() {
        if (getRms() < 0.0f) {
            return 0.0f;
        }
        return getRms() / 10.0f;
    }

    public final boolean isListening() {
        return (getSpeechState() == null || (getSpeechState() instanceof SpeechState.SpeechEnded)) ? false : true;
    }

    @Override // android.speech.RecognitionListener
    public void onBeginningOfSpeech() {
        InterfaceC2694i0 interfaceC2694i0 = this.timeoutJob;
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(null);
        }
        setCompletedText(getCompletedText() + getTextInProgress());
        setTextInProgress("");
        updateState(SpeechState.SpeechStarted.INSTANCE);
    }

    @Override // android.speech.RecognitionListener
    public void onEndOfSpeech() {
        this.timeoutJob = C2680e.c(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    @Override // android.speech.RecognitionListener
    public void onError(int i10) {
        if (i10 == 7) {
            stopListening();
        }
    }

    @Override // android.speech.RecognitionListener
    public void onPartialResults(Bundle bundle) {
        ArrayList<String> stringArrayList;
        String str;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || (str = (String) kotlin.collections.q.Q(0, stringArrayList)) == null) {
            return;
        }
        updateProgressText(str);
    }

    @Override // android.speech.RecognitionListener
    public void onResults(Bundle bundle) {
        ArrayList<String> stringArrayList;
        String str;
        if (bundle == null || (stringArrayList = bundle.getStringArrayList("results_recognition")) == null || (str = (String) kotlin.collections.q.Q(0, stringArrayList)) == null) {
            updateEndOfSpeechText("");
        } else {
            updateEndOfSpeechText(str);
        }
    }

    @Override // android.speech.RecognitionListener
    public void onRmsChanged(float f10) {
        setRms(f10);
    }

    public final void startListening() {
        if (this.isSpeechRecognizerAvailable) {
            Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
            intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
            intent.putExtra("android.speech.extras.SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS", 5000);
            intent.putExtra("android.speech.extra.LANGUAGE", Locale.getDefault());
            if (Build.VERSION.SDK_INT >= 34) {
                intent.putExtra("android.speech.extra.ENABLE_LANGUAGE_DETECTION", true);
                intent.putExtra("android.speech.extra.ENABLE_FORMATTING", "quality");
            }
            intent.putExtra("calling_package", BuildConfig.LIBRARY_PACKAGE_NAME);
            this.speechRecognizer.setRecognitionListener(this);
            this.speechRecognizer.startListening(intent);
            setTimer(System.currentTimeMillis());
            updateState(SpeechState.Listening.INSTANCE);
        }
    }

    public final void stopListening() {
        if (getSpeechState() == null) {
            return;
        }
        this.speechRecognizer.stopListening();
        this.speechRecognizer.setRecognitionListener(null);
        updateEndOfSpeechText("");
        InterfaceC2694i0 interfaceC2694i0 = this.timeoutJob;
        if (interfaceC2694i0 != null) {
            interfaceC2694i0.i(null);
        }
        setTimer(0L);
        kotlinx.coroutines.B.c(this.scope, null);
    }

    @Override // android.speech.RecognitionListener
    public void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public void onReadyForSpeech(Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public void onEvent(int i10, Bundle bundle) {
    }
}
