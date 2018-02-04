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
