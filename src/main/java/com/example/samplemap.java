 final List<CartItem> cartItemsList = new ArrayList<>();

 

       Map<String, WirelineCartItem> itemInfoMap = null;

              if (Optional.ofNullable(wirelineCart.getItemInfoMap()).isPresent() && !wirelineCart.getItemInfoMap().isEmpty()) {

                     itemInfoMap = wirelineCart.getItemInfoMap();

                    

                     for (final Map.Entry<String, WirelineCartItem> entry : itemInfoMap.entrySet()) {

                           if (Optional.ofNullable(entry).isPresent()) {

                                  WirelineCartItem wirelineCartItem = entry.getValue();

                                  if (Optional.ofNullable(wirelineCartItem).isPresent()) {

                                         final CartItem cartItem = new CartItem();

                                         if (Optional.ofNullable(wirelineCartItem).isPresent()) {

                                                cartItem.setProductId(wirelineCartItem.getProductId());

                                                cartItem.setSkuId(wirelineCartItem.getSkuId());

                                                cartItem.setDisplayName(wirelineCartItem.getDisplayName());

                                                cartItem.setDisplayItem(wirelineCartItem.isDisplayItem());

                                                cartItem.setDisplayPriceSequence(wirelineCartItem.getDisplayPriceSequence());

                                                cartItem.setDescription(wirelineCartItem.getDescription());

                                                cartItem.setLongDescription(wirelineCartItem.getLongDescription());

                                                cartItem.setPricePlanCode(wirelineCartItem.getPricePlanCode());

                                                cartItem.setAdminDisplayName(wirelineCartItem.getAdminDisplayName());

                                                cartItem.setItemId(wirelineCartItem.getItemId());

                                         }

                                         cartItemsList.add(cartItem);

                                  }

                           }

                     }

                    

              }



public void deleteItem(final List<CartItem> cartItems) {
		// TODO Auto-generated method stub
		List<String> itemIdsToDelete = new ArrayList<>();
		List<String> promotionIdsToDelete = new ArrayList<>();

		final Map<String, WirelineCartItem> itemInfoMap = wirelineCart.getItemInfoMap();
		if (Optional.ofNullable(itemInfoMap).isPresent()) {
			for (final String key : itemInfoMap.keySet()) {
				if (Optional.ofNullable(key).isPresent()) {
					final WirelineCartItem wirelineCartItem = wirelineCart.getItemInfoMap().get(key);
					for (final CartItem cartItem : cartItems) {
						if (Optional.ofNullable(cartItem).isPresent()
								&& wirelineCartItem.getSkuId().equals(cartItem.getSkuId())
								&& wirelineCartItem.getProductId().equals(cartItem.getProductId())) {
							itemIdsToDelete.add(wirelineCartItem.getItemId());
							promotionIdsToDelete = retrievePromotionID(wirelineCartItem.getPriceInfo(),promotionIdsToDelete);
						}
					}
				}

			}
		}
		removeItems(itemIdsToDelete);
		removePromotions(promotionIdsToDelete);

	}




List<String> cartKeys = new ArrayList<>();
		cartKeys.add("4234267667-1");
		cartKeys.add("2521567534-1");
private void addLosgId(Map<String,List<String>> losgIdItemsMap,CartItem cartItem,WirelineCartItem wirelineCartItem){
		List<String> itemIds = new ArrayList<>();
		if(losgIdItemsMap.containsKey(cartItem.getLosgId())){
			itemIds.addAll(losgIdItemsMap.get(cartItem.getLosgId()));
			itemIds.add(wirelineCartItem.getItemId());
			losgIdItemsMap.put(cartItem.getLosgId(), itemIds);
		}else if(losgIdItemsMap.isEmpty() 
				|| null == losgIdItemsMap.get(cartItem.getLosgId()) 
					|| losgIdItemsMap.get(cartItem.getLosgId()).isEmpty()){
			itemIds.add(wirelineCartItem.getItemId());
			losgIdItemsMap.put(cartItem.getLosgId(), itemIds);
		}
	}		

Set<COSCKey> paramSet = new HashSet<>();

final List<String> productIds = new ArrayList<>();
productIds.add(cartItem.getProductId());



private Map<String,List<String>> sortByComparator(Map<String,List<String>> unsortMap) {
		
		  Map<String,List<String>> sortedMap = new LinkedHashMap<String,List<String>>();
		  List<Entry<String, List<String>>> list = new LinkedList<Entry<String, List<String>>>(unsortMap.entrySet());
		
		  try{
	        //sort list based on comparator
	        Collections.sort(list, new Comparator() {
				public int compare(Object o1, Object o2) {
		           return ((Comparable) ((Map.Entry) (o1)).getKey())
		           .compareTo(((Map.Entry) (o2)).getKey());
	             }
	        });
	 
	        //put sorted list into map again
	      
	        for (Iterator iterator = list.iterator(); iterator.hasNext();)
	        {
				Entry<String, List<String>> entry = (Entry<String, List<String>>) iterator.next();
				Collections.sort(entry.getValue());
				sortedMap.put(entry.getKey(), entry.getValue());
			}
			}catch (Exception e) {
				//e.printStackTrace();
				log.debug("Exception: " + e.getMessage());
				log.debug(LobbyServerMessages.getStackTraceAsString(e));
			}
	        
			return sortedMap;
	   	}

}

