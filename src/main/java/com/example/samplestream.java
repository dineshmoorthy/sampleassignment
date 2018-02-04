 @SuppressWarnings("PMD.DataflowAnomalyAnalysis")

       public int getItemId(Map<String, WirelineCartItem> itemInfoMap) {

              int itemId;

              if (RestClientConstants.DEV_ENV.equals(env) || RestClientConstants.CI_ENV.equals(env)) {

                     itemId = (int) atomicLong.incrementAndGet();

              } else {

                     if (Optional.of(itemInfoMap).isPresent() && !itemInfoMap.isEmpty()) {

                           Stream<Entry<String, WirelineCartItem>> stringStream = itemInfoMap.entrySet().stream();

 

                           Entry<String, WirelineCartItem> maxCartItem = stringStream.reduce((cartItem1,

                                         cartItem2) -> Integer.valueOf(cartItem1.getValue().getItemId()) >

                                         Integer.valueOf(cartItem2.getValue().getItemId())

                                                       ? cartItem1 : cartItem2)

                                         .get();

                           itemId = Integer.valueOf(maxCartItem.getValue().getItemId()) + 1;

                     }else{

                           itemId = 1;

                     }

 

              }

              return itemId;

       }