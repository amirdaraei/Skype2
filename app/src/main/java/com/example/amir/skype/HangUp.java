package com.example.amir.skype;

/**
 * Created by Amir on 12/27/2017.
 */
//
//public class HangUp extends BroadcastReceiver {
//        static CallStartEndDetector listener;



//        @Override
//        public void onReceive(Context context, Intent intent) {
//            savedContext = context;
//            if(listener == null){
//                listener = new CallStartEndDetector();
//            }
//
//
//            TelephonyManager telephony = (TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
//            telephony.listen(listener, PhoneStateListener.LISTEN_CALL_STATE);
//        }
//
//
//
//        public class CallStartEndDetector extends PhoneStateListener {
//            int lastState = TelephonyManager.CALL_STATE_IDLE;
//            boolean isIncoming;
//
//            public PhonecallStartEndDetector() {}
//
//
//            //Incoming call-   IDLE to RINGING when it rings, to OFFHOOK when it's answered, to IDLE when hung up
//            //Outgoing call-  from IDLE to OFFHOOK when dialed out, to IDLE when hunged up
//
//            @Override
//            public void onCallStateChanged(int state, String incomingNumber) {
//                super.onCallStateChanged(state, incomingNumber);
//                if(lastState == state){
//                    //No change
//                    return;
//                }
//                switch (state) {
//                    case TelephonyManager.CALL_STATE_RINGING:
//                        isIncoming = true;
//                        //incoming call started
//                        break;
//                    case TelephonyManager.CALL_STATE_OFFHOOK:
//                        //Transition of ringing->offhook are pickups of incoming calls.  Nothing down on them
//                        if(lastState != TelephonyManager.CALL_STATE_RINGING){
//                            isIncoming = false;
//                            //outgoing call started
//                        }
//                        break;
//                    case TelephonyManager.CALL_STATE_IDLE:
//                        //End of call(Idle).  The type depends on the previous state(s)
//                        if(lastState == TelephonyManager.CALL_STATE_RINGING){
//                            // missed call
//                        }
//                        else if(isIncoming){
//                            //incoming call ended
//                        }
//                        else{
//                            //outgoing call ended
//                        }
//                        break;
//                }
//                lastState = state;
//            }
//
//        }
//
//
//
//    }

